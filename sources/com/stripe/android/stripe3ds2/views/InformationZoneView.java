package com.stripe.android.stripe3ds2.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import defpackage.dmk;
import defpackage.m4n;
import defpackage.ns9;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0014\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001b\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u0012\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0006R \u0010#\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010\u0004\u0012\u0004\b\"\u0010\b\u001a\u0004\b!\u0010\u0006R \u0010'\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0010\u0012\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0012R \u0010+\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0017\u0012\u0004\b*\u0010\b\u001a\u0004\b)\u0010\u0019R\"\u00103\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "a", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release$annotations", "()V", "whyLabel", "b", "getWhyText$3ds2sdk_release", "getWhyText$3ds2sdk_release$annotations", "whyText", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release$annotations", "whyContainer", "Landroidx/appcompat/widget/AppCompatImageView;", d.d, "Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release", "()Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release$annotations", "whyArrow", "e", "getExpandLabel$3ds2sdk_release", "getExpandLabel$3ds2sdk_release$annotations", "expandLabel", "f", "getExpandText$3ds2sdk_release", "getExpandText$3ds2sdk_release$annotations", "expandText", "g", "getExpandContainer$3ds2sdk_release", "getExpandContainer$3ds2sdk_release$annotations", "expandContainer", "h", "getExpandArrow$3ds2sdk_release", "getExpandArrow$3ds2sdk_release$annotations", "expandArrow", "", "i", "I", "getToggleColor$3ds2sdk_release", "()I", "setToggleColor$3ds2sdk_release", "(I)V", "toggleColor", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InformationZoneView extends FrameLayout {
    public static final /* synthetic */ int l = 0;

    /* renamed from: a, reason: from kotlin metadata */
    public final ThreeDS2TextView whyLabel;

    /* renamed from: b, reason: from kotlin metadata */
    public final ThreeDS2TextView whyText;

    /* renamed from: c, reason: from kotlin metadata */
    public final LinearLayout whyContainer;

    /* renamed from: d, reason: from kotlin metadata */
    public final AppCompatImageView whyArrow;

    /* renamed from: e, reason: from kotlin metadata */
    public final ThreeDS2TextView expandLabel;

    /* renamed from: f, reason: from kotlin metadata */
    public final ThreeDS2TextView expandText;

    /* renamed from: g, reason: from kotlin metadata */
    public final LinearLayout expandContainer;

    /* renamed from: h, reason: from kotlin metadata */
    public final AppCompatImageView expandArrow;

    /* renamed from: i, reason: from kotlin metadata */
    public int toggleColor;
    public int j;
    public final int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.stripe_information_zone_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.expand_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) m4n.d(inflate, R.id.expand_arrow);
        if (appCompatImageView != null) {
            i2 = R.id.expand_container;
            LinearLayout linearLayout = (LinearLayout) m4n.d(inflate, R.id.expand_container);
            if (linearLayout != null) {
                i2 = R.id.expand_label;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) m4n.d(inflate, R.id.expand_label);
                if (threeDS2TextView != null) {
                    i2 = R.id.expand_text;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) m4n.d(inflate, R.id.expand_text);
                    if (threeDS2TextView2 != null) {
                        i2 = R.id.why_arrow;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) m4n.d(inflate, R.id.why_arrow);
                        if (appCompatImageView2 != null) {
                            i2 = R.id.why_container;
                            LinearLayout linearLayout2 = (LinearLayout) m4n.d(inflate, R.id.why_container);
                            if (linearLayout2 != null) {
                                i2 = R.id.why_label;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) m4n.d(inflate, R.id.why_label);
                                if (threeDS2TextView3 != null) {
                                    i2 = R.id.why_text;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) m4n.d(inflate, R.id.why_text);
                                    if (threeDS2TextView4 != null) {
                                        this.whyLabel = threeDS2TextView3;
                                        this.whyText = threeDS2TextView4;
                                        this.whyContainer = linearLayout2;
                                        this.whyArrow = appCompatImageView2;
                                        this.expandLabel = threeDS2TextView;
                                        this.expandText = threeDS2TextView2;
                                        this.expandContainer = linearLayout;
                                        this.expandArrow = appCompatImageView;
                                        this.k = getResources().getInteger(android.R.integer.config_shortAnimTime);
                                        linearLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: zu9
                                            public final /* synthetic */ InformationZoneView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i3 = i;
                                                InformationZoneView informationZoneView = this.b;
                                                switch (i3) {
                                                    case 0:
                                                        informationZoneView.a(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
                                                        return;
                                                    default:
                                                        informationZoneView.a(informationZoneView.expandArrow, informationZoneView.expandLabel, informationZoneView.expandText);
                                                        return;
                                                }
                                            }
                                        });
                                        final int i3 = 1;
                                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zu9
                                            public final /* synthetic */ InformationZoneView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i32 = i3;
                                                InformationZoneView informationZoneView = this.b;
                                                switch (i32) {
                                                    case 0:
                                                        informationZoneView.a(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
                                                        return;
                                                    default:
                                                        informationZoneView.a(informationZoneView.expandArrow, informationZoneView.expandLabel, informationZoneView.expandText);
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(View view, TextView textView, View view2) {
        boolean z;
        int i;
        int i2 = 0;
        if (view2.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = BlurConstants.H_BD;
        } else {
            i = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", i);
        long j = this.k;
        ofFloat.setDuration(j);
        ofFloat.start();
        textView.setEnabled(z);
        view.setEnabled(z);
        if (this.toggleColor != 0) {
            int i3 = this.j;
            if (i3 == 0) {
                i3 = textView.getTextColors().getDefaultColor();
                this.j = i3;
            }
            if (z) {
                i3 = this.toggleColor;
            }
            textView.setTextColor(i3);
        }
        if (!z) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        if (z) {
            view2.postDelayed(new ns9(view2, 1), j);
        }
    }

    /* renamed from: getExpandArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getExpandArrow() {
        return this.expandArrow;
    }

    /* renamed from: getExpandContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getExpandContainer() {
        return this.expandContainer;
    }

    /* renamed from: getExpandLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandLabel() {
        return this.expandLabel;
    }

    /* renamed from: getExpandText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandText() {
        return this.expandText;
    }

    /* renamed from: getToggleColor$3ds2sdk_release, reason: from getter */
    public final int getToggleColor() {
        return this.toggleColor;
    }

    /* renamed from: getWhyArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getWhyArrow() {
        return this.whyArrow;
    }

    /* renamed from: getWhyContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getWhyContainer() {
        return this.whyContainer;
    }

    /* renamed from: getWhyLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyLabel() {
        return this.whyLabel;
    }

    /* renamed from: getWhyText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyText() {
        return this.whyText;
    }

    public final void setToggleColor$3ds2sdk_release(int i) {
        this.toggleColor = i;
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }
}
