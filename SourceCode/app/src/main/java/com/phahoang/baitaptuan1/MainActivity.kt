package com.phahoang.baitaptuan1

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.content.res.ColorStateList
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView
import android.widget.Button
import android.widget.FrameLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //main layout
        val root = FrameLayout(this)
        root.setBackgroundColor(Color.WHITE)

        //back button
        val backButton = Button(this)
        backButton.text = "⬅️"
        backButton.textSize = 32f
        backButton.setTextColor(Color.BLACK)
        backButton.setBackgroundColor(Color.TRANSPARENT)

        val backParams = FrameLayout.LayoutParams(
            60.dp,
            60.dp
        )
        backParams.gravity = Gravity.TOP or Gravity.START
        backParams.topMargin = 20.dp
        backParams.leftMargin = 10.dp
        root.addView(backButton, backParams)

        //edit button
        val editButton = Button(this)
        editButton.text = "✏\uFE0F"
        editButton.textSize = 32f
        editButton.setTextColor(Color.BLACK)
        editButton.setBackgroundColor(Color.TRANSPARENT)
        val editParams = FrameLayout.LayoutParams(
            80.dp,
            60.dp
        )

        editParams.gravity = Gravity.TOP or Gravity.END
        editParams.topMargin = 20.dp
        editParams.rightMargin = 10.dp
        root.addView(editButton, editParams)


        //avatar
        val avatar = ShapeableImageView(this)

        avatar.setImageResource(R.drawable.avatar)
        avatar.scaleType = ImageView.ScaleType.CENTER_CROP

        avatar.shapeAppearanceModel =
            avatar.shapeAppearanceModel.toBuilder()
                .setAllCornerSizes(125.dp.toFloat())
                .build()

        avatar.strokeWidth = 1.dp.toFloat()
        avatar.strokeColor = ColorStateList.valueOf(Color.CYAN)

        val avatarParams = FrameLayout.LayoutParams(
            250.dp,
            250.dp
        )
        avatarParams.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
        avatarParams.topMargin = 210.dp

        root.addView(avatar, avatarParams)

        //name
        val name = TextView(this)
        name.text = "Nguyễn Hoàng Pha"
        name.textSize = 32f
        name.setTextColor(Color.BLACK)
        name.setTypeface(null, Typeface.BOLD)
        name.gravity = Gravity.CENTER

        val nameParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        nameParams.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
        nameParams.topMargin = 460.dp

        root.addView(name, nameParams)

        //mssv
        val studentId = TextView(this)
        studentId.text = "091206012728"
        studentId.textSize = 20f
        studentId.setTextColor(Color.GRAY)
        studentId.gravity = Gravity.CENTER

        val idParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        idParams.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
        idParams.topMargin = 502.dp

        root.addView(studentId, idParams)
        setContentView(root)
    }

    //chueyen dp
    private val Int.dp: Int
        get() = (this * resources.displayMetrics.density).toInt()
}