package skip.lib;

import defpackage.gkj;
import defpackage.hkj;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lskip/lib/PseudoRandomNumberGenerator;", "Lskip/lib/RawRepresentable;", "Ljava/util/Random;", "Lskip/lib/RandomNumberGenerator;", "rawValue", "<init>", "(Ljava/util/Random;)V", "Lhkj;", "next-s-VKNKU", "()J", "next", "Ljava/util/Random;", "getRawValue", "()Ljava/util/Random;", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PseudoRandomNumberGenerator implements RawRepresentable<Random>, RandomNumberGenerator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Random rawValue;

    public PseudoRandomNumberGenerator(Random random) {
        random.getClass();
        this.rawValue = (Random) StructKt.sref$default(random, null, 1, null);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Random getRawValue() {
        return getRawValue();
    }

    @Override // skip.lib.RandomNumberGenerator
    /* renamed from: next-s-VKNKU, reason: not valid java name */
    public long mo1359nextsVKNKU() {
        long nextLong = getRawValue().nextLong();
        gkj gkjVar = hkj.b;
        return nextLong;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/lib/PseudoRandomNumberGenerator$Companion;", "", "<init>", "()V", "seeded", "Lskip/lib/PseudoRandomNumberGenerator;", "seed", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PseudoRandomNumberGenerator seeded(long seed) {
            return new PseudoRandomNumberGenerator(new Random(seed));
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public Random getRawValue() {
        return this.rawValue;
    }

    public /* synthetic */ PseudoRandomNumberGenerator(Random random, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Random() : random);
    }
}
