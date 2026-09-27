package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.android.sdk.logger.LumberMill;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ProgressFrameLayout extends FrameLayout implements UploadProgressListener {
    private final Twig twig;
    final UploadProgressBar uploadProgressBar;

    public ProgressFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.twig = LumberMill.getLogger();
        UploadProgressBar uploadProgressBar = new UploadProgressBar(context, attributeSet);
        this.uploadProgressBar = uploadProgressBar;
        addView(uploadProgressBar);
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadNotice(final byte b) {
        this.twig.internal("progress", "" + ((int) b));
        post(new Runnable() { // from class: io.intercom.android.sdk.views.ProgressFrameLayout.1
            @Override // java.lang.Runnable
            public void run() {
                ProgressFrameLayout.this.uploadProgressBar.setProgress(b);
            }
        });
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadSmoothEnd() {
        post(new Runnable() { // from class: io.intercom.android.sdk.views.ProgressFrameLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ProgressFrameLayout.this.uploadProgressBar.smoothEndAnimation();
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

    public ProgressFrameLayout(Context context) {
        this(context, null);
    }
}
