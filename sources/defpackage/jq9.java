package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jq9 implements vcj, DefaultLifecycleObserver, woi {
    public boolean a;
    public final ImageView b;

    public jq9(ImageView imageView) {
        this.b = imageView;
    }

    public final void a() {
        Animatable animatable;
        Object drawable = this.b.getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void b(Drawable drawable) {
        Animatable animatable;
        ImageView imageView = this.b;
        Object drawable2 = imageView.getDrawable();
        if (drawable2 instanceof Animatable) {
            animatable = (Animatable) drawable2;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jq9) {
            if (Intrinsics.areEqual(this.b, ((jq9) obj).b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.vcj
    public final Drawable h() {
        return this.b.getDrawable();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.woi
    public final void onError(Drawable drawable) {
        b(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.a = true;
        a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.a = false;
        a();
    }

    @Override // defpackage.woi
    public final void onSuccess(Drawable drawable) {
        b(drawable);
    }

    @Override // defpackage.woi
    public final void onStart(Drawable drawable) {
        b(drawable);
    }
}
