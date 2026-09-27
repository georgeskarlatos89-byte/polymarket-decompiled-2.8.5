package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yrd implements z0b {
    public final Function1 a;
    public final Function4 b;

    public yrd(Function4 function4, Function1 function1) {
        this.a = function1;
        this.b = function4;
    }

    @Override // defpackage.z0b
    public final Function1 getKey() {
        return this.a;
    }
}
