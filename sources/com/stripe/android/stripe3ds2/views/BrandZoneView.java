package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.polymarket.android.R;
import defpackage.dmk;
import defpackage.m4n;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getIssuerImageView$3ds2sdk_release", "()Landroid/widget/ImageView;", "issuerImageView", "b", "getPaymentSystemImageView$3ds2sdk_release", "paymentSystemImageView", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandZoneView extends LinearLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final ImageView issuerImageView;

    /* renamed from: b, reason: from kotlin metadata */
    public final ImageView paymentSystemImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.stripe_brand_zone_view, this);
        int i = R.id.issuer_image;
        ImageView imageView = (ImageView) m4n.d(this, R.id.issuer_image);
        if (imageView != null) {
            i = R.id.payment_system_image;
            ImageView imageView2 = (ImageView) m4n.d(this, R.id.payment_system_image);
            if (imageView2 != null) {
                this.issuerImageView = imageView;
                this.paymentSystemImageView = imageView2;
                return;
            }
        }
        dmk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* renamed from: getIssuerImageView$3ds2sdk_release, reason: from getter */
    public final ImageView getIssuerImageView() {
        return this.issuerImageView;
    }

    /* renamed from: getPaymentSystemImageView$3ds2sdk_release, reason: from getter */
    public final ImageView getPaymentSystemImageView() {
        return this.paymentSystemImageView;
    }
}
