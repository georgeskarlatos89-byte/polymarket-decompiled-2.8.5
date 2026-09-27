package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n9 {
    public final pk4 a;
    public final Integer b;
    public final pk4 c;

    public n9(pk4 pk4Var, Integer num) {
        this.a = pk4Var;
        this.b = num;
        this.c = pk4Var;
    }

    public final void a(Class cls, Bundle bundle, int i) {
        pk4 pk4Var = this.a;
        Intent putExtras = new Intent(pk4Var, (Class<?>) cls).putExtras(bundle);
        putExtras.getClass();
        pk4Var.startActivityForResult(putExtras, i);
    }
}
