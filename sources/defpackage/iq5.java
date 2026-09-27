package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1f b;

    public /* synthetic */ iq5(w1f w1fVar, int i) {
        this.a = i;
        this.b = w1fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        w1f w1fVar = this.b;
        switch (i) {
            case 0:
                return "Clearing all data for key: " + w1fVar + '.';
            case 1:
                return m51.m(new StringBuilder("Checking if data store contains data for key: "), w1fVar.a, '.');
            default:
                return m51.m(new StringBuilder("Reading data for key: "), w1fVar.a, '.');
        }
    }
}
