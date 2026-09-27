package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.ConsumerAlert;
import com.google.android.libraries.places.api.model.ConsumerAlertDetails;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zztk extends Dialog {
    private final int zza;
    private final ConsumerAlert zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztk(Context context, int i, ConsumerAlert consumerAlert) {
        super(context, i);
        context.getClass();
        consumerAlert.getClass();
        this.zza = i;
        this.zzb = consumerAlert;
    }

    public static /* synthetic */ void zza(TextView textView, zztk zztkVar, View view) {
        zzb(textView, zztkVar, view);
    }

    private static final void zzb(TextView textView, zztk zztkVar, View view) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        ConsumerAlertDetails details = zztkVar.zzb.getDetails();
        if (details != null) {
            uri = details.getAboutLinkUri();
        } else {
            uri = null;
        }
        intent.setData(uri);
        try {
            textView.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Context context = textView.getContext();
            context.getClass();
            new zztu(context, zztkVar.zza).show();
        }
    }

    private static final void zzc(View view, CharSequence charSequence) {
        if (charSequence != null && !StringsKt.T(charSequence)) {
            if (view instanceof TextView) {
                ((TextView) view).setText(charSequence);
            }
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView(R.layout.cma_dialog);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        View findViewById = findViewById(R.id.cma_details_title);
        findViewById.getClass();
        ConsumerAlert consumerAlert = this.zzb;
        ConsumerAlertDetails details = consumerAlert.getDetails();
        if (details != null) {
            str = details.getTitle();
        } else {
            str = null;
        }
        zzc(findViewById, str);
        View findViewById2 = findViewById(R.id.cma_details_description);
        findViewById2.getClass();
        ConsumerAlertDetails details2 = consumerAlert.getDetails();
        if (details2 != null) {
            str2 = details2.getDescription();
        } else {
            str2 = null;
        }
        zzc(findViewById2, str2);
        final TextView textView = (TextView) findViewById(R.id.cma_details_link);
        textView.getClass();
        ConsumerAlertDetails details3 = consumerAlert.getDetails();
        if (details3 != null) {
            str3 = details3.getAboutLinkTitle();
        } else {
            str3 = null;
        }
        zzc(textView, str3);
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable != null) {
            drawable.setBounds(0, 0, textView.getLineHeight(), textView.getLineHeight());
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zztj
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zztk.zza(textView, this, view);
            }
        });
        Button button = (Button) findViewById(R.id.cma_alert_ok);
        button.getClass();
        Object parent = button.getParent();
        parent.getClass();
        Context context = button.getContext();
        context.getClass();
        zzsv.zza(button, (View) parent, context, 48, 48);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzti
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                zztk.this.dismiss();
            }
        });
    }
}
