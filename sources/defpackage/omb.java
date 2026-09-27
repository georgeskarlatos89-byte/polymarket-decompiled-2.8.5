package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class omb implements m1d {
    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.m1d
    public final Object j(long j, long j2, Continuation continuation) {
        return new j5k(r3n.a(j5k.b(j2), 0.0f));
    }
}
