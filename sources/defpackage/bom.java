package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bom {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final unl d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public bom(Context context, unl unlVar, Long l, Long l2) {
        this.e = true;
        arn.h(context);
        Context applicationContext = context.getApplicationContext();
        arn.h(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (unlVar != null) {
            this.d = unlVar;
            this.e = unlVar.c;
            this.c = unlVar.b;
            this.h = unlVar.e;
            Bundle bundle = unlVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
