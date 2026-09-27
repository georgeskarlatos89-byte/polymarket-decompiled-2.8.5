package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.view.MaskedCardView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i8i implements y8k {
    public final MaskedCardView a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;

    public i8i(MaskedCardView maskedCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.a = maskedCardView;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatTextView;
    }

    @Override // defpackage.y8k
    public final View getRoot() {
        return this.a;
    }
}
