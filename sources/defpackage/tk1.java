package defpackage;

import bo.app.m8;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;

    public /* synthetic */ tk1(Class cls, int i) {
        this.a = i;
        this.b = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Class cls = this.b;
        switch (i) {
            case 0:
                return "Failed to remove " + cls.getName() + " subscriber.";
            case 1:
                return m8.d(cls);
            case 2:
                return m8.b(cls);
            default:
                return m8.c(cls);
        }
    }
}
