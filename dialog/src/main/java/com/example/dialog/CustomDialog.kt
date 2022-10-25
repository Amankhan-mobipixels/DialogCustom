package com.example.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.bumptech.glide.Glide


class CustomDialog {

    var heading: String? = null
    var description: String? = null
    var image: Drawable? = null
    var lottieAnimation: String? = null

    constructor(
        heading: String,
        description: String,
        image: Drawable
    ) {
        this.heading = heading
        this.description = description
        this.image = image
    }

    constructor(
        heading: String,
        description: String,
        lottieAnimation: String
    ) {
        this.heading = heading
        this.description = description
        this.lottieAnimation = lottieAnimation
    }

    fun createDialog(context: Context) {

        var headingView: TextView? = null
        var descriptionView: TextView? = null
        var imageView: ImageView? = null
        var lottieAnimationView: LottieAnimationView? = null
        var close: Button? = null

        val dialog = Dialog(context, androidx.appcompat.R.style.Theme_AppCompat);
        dialog.setContentView(R.layout.dialog);
        headingView = dialog.findViewById(R.id.heading);
        descriptionView = dialog.findViewById(R.id.description);
        imageView = dialog.findViewById(R.id.imageView);
        lottieAnimationView = dialog.findViewById(R.id.lottieAnimationView);
        close = dialog.findViewById(R.id.close);

        headingView.setText(heading)
        descriptionView.setText(description)
        close.setOnClickListener {
            dialog.dismiss()
        }

        if (image != null) {
            Glide.with(context).load(image).into(imageView)
        } else {
            imageView.visibility = View.GONE
        }
        if (lottieAnimation != null) {
            lottieAnimationView.setAnimationFromUrl(lottieAnimation)
            lottieAnimationView.playAnimation();
            lottieAnimationView.loop(true);
        } else {
            lottieAnimationView.visibility = View.GONE
        }
        dialog.getWindow()?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }


}