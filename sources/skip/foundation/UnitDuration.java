package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitDuration;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitDuration extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitDuration hours = new UnitDuration("hr", new UnitConverterLinear(3600.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitDuration minutes = new UnitDuration("min", new UnitConverterLinear(60.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitDuration seconds = new UnitDuration("s", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitDuration milliseconds = new UnitDuration("ms", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitDuration microseconds = new UnitDuration("µs", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitDuration nanoseconds = new UnitDuration("ns", new UnitConverterLinear(1.0E-9d, ConstantsKt.UNSET, 2, null));
    private static final UnitDuration picoseconds = new UnitDuration("ps", new UnitConverterLinear(1.0E-12d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lskip/foundation/UnitDuration$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "hours", "Lskip/foundation/UnitDuration;", "getHours", "()Lskip/foundation/UnitDuration;", "minutes", "getMinutes", "seconds", "getSeconds", "milliseconds", "getMilliseconds", "microseconds", "getMicroseconds", "nanoseconds", "getNanoseconds", "picoseconds", "getPicoseconds", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitDuration.INSTANCE.baseUnit();
        }

        public UnitDuration getHours() {
            return UnitDuration.INSTANCE.getHours();
        }

        public UnitDuration getMicroseconds() {
            return UnitDuration.INSTANCE.getMicroseconds();
        }

        public UnitDuration getMilliseconds() {
            return UnitDuration.INSTANCE.getMilliseconds();
        }

        public UnitDuration getMinutes() {
            return UnitDuration.INSTANCE.getMinutes();
        }

        public UnitDuration getNanoseconds() {
            return UnitDuration.INSTANCE.getNanoseconds();
        }

        public UnitDuration getPicoseconds() {
            return UnitDuration.INSTANCE.getPicoseconds();
        }

        public UnitDuration getSeconds() {
            return UnitDuration.INSTANCE.getSeconds();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitDuration(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitDuration access$getHours$cp() {
        return hours;
    }

    public static final /* synthetic */ UnitDuration access$getMicroseconds$cp() {
        return microseconds;
    }

    public static final /* synthetic */ UnitDuration access$getMilliseconds$cp() {
        return milliseconds;
    }

    public static final /* synthetic */ UnitDuration access$getMinutes$cp() {
        return minutes;
    }

    public static final /* synthetic */ UnitDuration access$getNanoseconds$cp() {
        return nanoseconds;
    }

    public static final /* synthetic */ UnitDuration access$getPicoseconds$cp() {
        return picoseconds;
    }

    public static final /* synthetic */ UnitDuration access$getSeconds$cp() {
        return seconds;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lskip/foundation/UnitDuration$Companion;", "Lskip/foundation/UnitDuration$CompanionClass;", "<init>", "()V", "hours", "Lskip/foundation/UnitDuration;", "getHours", "()Lskip/foundation/UnitDuration;", "minutes", "getMinutes", "seconds", "getSeconds", "milliseconds", "getMilliseconds", "microseconds", "getMicroseconds", "nanoseconds", "getNanoseconds", "picoseconds", "getPicoseconds", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getSeconds();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getHours() {
            return UnitDuration.access$getHours$cp();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getMicroseconds() {
            return UnitDuration.access$getMicroseconds$cp();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getMilliseconds() {
            return UnitDuration.access$getMilliseconds$cp();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getMinutes() {
            return UnitDuration.access$getMinutes$cp();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getNanoseconds() {
            return UnitDuration.access$getNanoseconds$cp();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getPicoseconds() {
            return UnitDuration.access$getPicoseconds$cp();
        }

        @Override // skip.foundation.UnitDuration.CompanionClass
        public UnitDuration getSeconds() {
            return UnitDuration.access$getSeconds$cp();
        }

        private Companion() {
        }
    }
}
