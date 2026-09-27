package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class iq9 extends nbk {
    private Animatable animatable;

    public Drawable getCurrentDrawable() {
        return ((ImageView) this.view).getDrawable();
    }

    @Override // defpackage.nbk, defpackage.voi
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
        setResource(null);
        this.animatable = null;
        setDrawable(drawable);
    }

    @Override // defpackage.voi
    public void onLoadFailed(Drawable drawable) {
        setResource(null);
        this.animatable = null;
        setDrawable(drawable);
    }

    @Override // defpackage.voi
    public void onLoadStarted(Drawable drawable) {
        a();
        setResource(null);
        this.animatable = null;
        setDrawable(drawable);
    }

    @Override // defpackage.voi
    public void onResourceReady(Object obj, jcj jcjVar) {
        setResource(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.animatable = animatable;
            animatable.start();
            return;
        }
        this.animatable = null;
    }

    @Override // defpackage.k7b
    public void onStart() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.k7b
    public void onStop() {
        Animatable animatable = this.animatable;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void setDrawable(Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    public abstract void setResource(Object obj);
}
