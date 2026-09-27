package io.intercom.android.sdk.lightbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class LightBoxImageView extends AppCompatImageView {
    GestureDetector gestureDetector;
    LightBoxListener lightBoxListener;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            LightBoxListener lightBoxListener = LightBoxImageView.this.lightBoxListener;
            if (lightBoxListener != null) {
                lightBoxListener.closeLightBox();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public LightBoxImageView(Context context) {
        super(context, null);
        init();
    }

    private void init() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureListener());
        setOnTouchListener(new View.OnTouchListener() { // from class: io.intercom.android.sdk.lightbox.LightBoxImageView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return LightBoxImageView.this.gestureDetector.onTouchEvent(motionEvent);
            }
        });
    }

    public void setLightBoxListener(LightBoxListener lightBoxListener) {
        this.lightBoxListener = lightBoxListener;
    }

    public LightBoxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
