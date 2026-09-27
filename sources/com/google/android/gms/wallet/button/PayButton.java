package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.polymarket.android.R;
import defpackage.arn;
import defpackage.ilf;
import defpackage.j57;
import defpackage.m57;
import defpackage.rfd;
import defpackage.uhl;
import defpackage.usk;
import defpackage.wil;
import defpackage.xbc;
import defpackage.zfn;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {
    public View.OnClickListener a;
    public final uhl b;
    public View c;

    public PayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ButtonOptions buttonOptions = new ButtonOptions();
        this.b = new uhl(buttonOptions, 13);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ilf.a);
        int i = obtainStyledAttributes.getInt(0, 1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
        buttonOptions.b = i;
        buttonOptions.c = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(1)) {
            buttonOptions.e = true;
        }
        obtainStyledAttributes.recycle();
        buttonOptions.a = 1;
        if (isInEditMode()) {
            b(buttonOptions);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ButtonOptions buttonOptions) {
        wil wilVar;
        int i;
        int i2 = buttonOptions.a;
        uhl uhlVar = this.b;
        if (i2 != 0) {
            ((ButtonOptions) uhlVar.b).a = i2;
        }
        int i3 = buttonOptions.b;
        if (i3 != 0) {
            ((ButtonOptions) uhlVar.b).b = i3;
        }
        if (buttonOptions.e) {
            int i4 = buttonOptions.c;
            ButtonOptions buttonOptions2 = (ButtonOptions) uhlVar.b;
            buttonOptions2.c = i4;
            buttonOptions2.e = true;
        }
        String str = buttonOptions.d;
        if (str != null) {
            ((ButtonOptions) uhlVar.b).d = str;
        }
        if (!isInEditMode()) {
            removeAllViews();
            ButtonOptions buttonOptions3 = (ButtonOptions) uhlVar.b;
            View view = null;
            if (buttonOptions3.a == 9 && GoogleApiAvailability.e.b(getContext(), 241500000) != 0) {
                removeAllViews();
                if (buttonOptions3.b == 2) {
                    i = R.style.PayButtonGenericLightTheme;
                } else {
                    i = R.style.PayButtonGenericDarkTheme;
                }
                LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(getContext(), i), null);
                ((LinearLayout) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.pay_button_pix_static, (ViewGroup) linearLayout, true).findViewById(R.id.pay_button_view)).setBackground(zfn.a(linearLayout.getContext(), buttonOptions3.c));
                linearLayout.setContentDescription(linearLayout.getContext().getString(R.string.direct_pix_payment));
                this.c = linearLayout;
                addView(linearLayout);
                this.c.setOnClickListener(this);
                m0.d("PayButton", "Failed to create latest PIX buttonView: Google Play Services version is outdated.");
                return;
            }
            if (GoogleApiAvailability.e.b(getContext(), 232100000) != 0) {
                b(buttonOptions3);
                m0.d("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
                return;
            }
            if (TextUtils.isEmpty(buttonOptions3.d)) {
                m0.d("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                return;
            }
            Context context = getContext();
            arn.h(context);
            try {
                m57 c = m57.c(context, m57.b, "com.google.android.gms.wallet_dynamite");
                try {
                    IBinder b = c.b("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
                    if (b == null) {
                        wilVar = 0;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                        if (queryLocalInterface instanceof wil) {
                            wilVar = (wil) queryLocalInterface;
                        } else {
                            wilVar = new usk(b, "com.google.android.gms.wallet.button.IPayButtonCreator", 8);
                        }
                    }
                    if (wilVar != 0) {
                        view = (View) rfd.S(wilVar.P(new rfd(new Context[]{c.a, context}), buttonOptions3));
                    } else {
                        m0.d("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
                    }
                } catch (RemoteException | j57 e) {
                    m0.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
                }
                this.c = view;
                if (view == null) {
                    m0.d("PayButton", "Failed to create buttonView");
                    return;
                } else {
                    addView(view);
                    this.c.setOnClickListener(this);
                    return;
                }
            } catch (j57 e2) {
                xbc.m(e2);
                return;
            }
        }
        b((ButtonOptions) uhlVar.b);
    }

    public final void b(ButtonOptions buttonOptions) {
        int i;
        removeAllViews();
        if (buttonOptions.b == 2) {
            i = R.style.PayButtonGenericLightTheme;
        } else {
            i = R.style.PayButtonGenericDarkTheme;
        }
        LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(getContext(), i), null);
        ((LinearLayout) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) linearLayout, true).findViewById(R.id.pay_button_view)).setBackground(zfn.a(linearLayout.getContext(), buttonOptions.c));
        linearLayout.setContentDescription(linearLayout.getContext().getString(R.string.gpay_logo_description));
        this.c = linearLayout;
        addView(linearLayout);
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null && view == this.c) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }
}
