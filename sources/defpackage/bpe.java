package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bpe extends s4 {
    @Override // defpackage.gnf
    public final int e(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.gnf
    public final long g(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.s4
    public final Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
