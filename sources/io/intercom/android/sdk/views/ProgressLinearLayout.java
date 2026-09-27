package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.android.sdk.logger.LumberMill;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ProgressLinearLayout extends LinearLayout implements UploadProgressListener {
    ImageView attachmentIcon;
    private final Twig twig;
    UploadProgressBar uploadProgressBar;

    public ProgressLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.twig = LumberMill.getLogger();
    }

    public void setAttachmentIcon(ImageView imageView) {
        this.attachmentIcon = imageView;
    }

    public void setUploadProgressBar(UploadProgressBar uploadProgressBar) {
        this.uploadProgressBar = uploadProgressBar;
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadNotice(final byte b) {
        this.twig.internal("progress", "" + ((int) b));
        post(new Runnable() { // from class: io.intercom.android.sdk.views.ProgressLinearLayout.1
            @Override // java.lang.Runnable
            public void run() {
                UploadProgressBar uploadProgressBar = ProgressLinearLayout.this.uploadProgressBar;
                if (uploadProgressBar != null) {
                    uploadProgressBar.setProgress(b);
                }
            }
        });
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadSmoothEnd() {
        post(new Runnable() { // from class: io.intercom.android.sdk.views.ProgressLinearLayout.2
            @Override // java.lang.Runnable
            public void run() {
                UploadProgressBar uploadProgressBar = ProgressLinearLayout.this.uploadProgressBar;
                if (uploadProgressBar != null) {
                    uploadProgressBar.smoothEndAnimation(new Animator.AnimatorListener() { // from class: io.intercom.android.sdk.views.ProgressLinearLayout.2.1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            ProgressLinearLayout.this.uploadProgressBar.hideBar();
                            ImageView imageView = ProgressLinearLayout.this.attachmentIcon;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ProgressLinearLayout.this.attachmentIcon, "alpha", 0.0f, 1.0f);
                                ofFloat.setDuration(300L);
                                ofFloat.setInterpolator(new DecelerateInterpolator());
                                ofFloat.start();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                }
            }
        });
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStarted() {
        this.uploadProgressBar.smoothStartAnimation();
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStopped() {
        this.uploadProgressBar.hideBar();
    }

    public ProgressLinearLayout(Context context) {
        this(context, null);
    }
}
