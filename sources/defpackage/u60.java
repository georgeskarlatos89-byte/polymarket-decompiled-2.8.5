package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u60 implements txj {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.txj
    public final void a(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    ((Context) obj).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                } catch (ActivityNotFoundException e) {
                    throw new IllegalArgumentException(hdi.o("Can't open ", str, '.'), e);
                }
            default:
                str.getClass();
                ((Function1) obj).invoke(Uri.parse(str));
                return;
        }
    }
}
