package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m52 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;

    public /* synthetic */ m52(float f, float f2, long j, float f3) {
        this.b = f;
        this.c = f2;
        this.d = j;
        this.e = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.e;
        float f2 = this.c;
        switch (i) {
            case 0:
                y07 y07Var = (y07) obj;
                y07Var.getClass();
                y07.P0(y07Var, this.d, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y07Var.d() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), this.b, 0, scn.a(new float[]{f2, f}), 464);
                return Unit.INSTANCE;
            default:
                y07 y07Var2 = (y07) obj;
                y07Var2.getClass();
                y07.P0(y07Var2, this.d, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y07Var2.d() & 4294967295L)) / 2.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y07Var2.d() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (y07Var2.d() & 4294967295L)) / 2.0f) & 4294967295L), y07Var2.t0(f), 1, scn.a(new float[]{y07Var2.t0(this.b), y07Var2.t0(f2)}), 448);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m52(long j, float f, float f2, float f3) {
        this.d = j;
        this.b = f;
        this.c = f2;
        this.e = f3;
    }
}
