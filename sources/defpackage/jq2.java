package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jq2 implements ffb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jq2(Context context, String str, int i, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.ffb
    public final void a(qab qabVar) {
        int i = this.a;
        String str = this.c;
        Context context = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                qabVar.getClass();
                Function2 a = ((lq2) obj).a();
                str.getClass();
                a.invoke(context, str);
                return;
            default:
                qabVar.getClass();
                ((Function0) obj).invoke();
                l55.d(context, str);
                return;
        }
    }
}
