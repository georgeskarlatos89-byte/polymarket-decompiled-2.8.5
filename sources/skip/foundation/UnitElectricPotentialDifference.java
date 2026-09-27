package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitElectricPotentialDifference;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitElectricPotentialDifference extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitElectricPotentialDifference megavolts = new UnitElectricPotentialDifference("MV", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricPotentialDifference kilovolts = new UnitElectricPotentialDifference("kV", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricPotentialDifference volts = new UnitElectricPotentialDifference("V", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricPotentialDifference millivolts = new UnitElectricPotentialDifference("mV", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricPotentialDifference microvolts = new UnitElectricPotentialDifference("µV", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lskip/foundation/UnitElectricPotentialDifference$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "megavolts", "Lskip/foundation/UnitElectricPotentialDifference;", "getMegavolts", "()Lskip/foundation/UnitElectricPotentialDifference;", "kilovolts", "getKilovolts", "volts", "getVolts", "millivolts", "getMillivolts", "microvolts", "getMicrovolts", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitElectricPotentialDifference.INSTANCE.baseUnit();
        }

        public UnitElectricPotentialDifference getKilovolts() {
            return UnitElectricPotentialDifference.INSTANCE.getKilovolts();
        }

        public UnitElectricPotentialDifference getMegavolts() {
            return UnitElectricPotentialDifference.INSTANCE.getMegavolts();
        }

        public UnitElectricPotentialDifference getMicrovolts() {
            return UnitElectricPotentialDifference.INSTANCE.getMicrovolts();
        }

        public UnitElectricPotentialDifference getMillivolts() {
            return UnitElectricPotentialDifference.INSTANCE.getMillivolts();
        }

        public UnitElectricPotentialDifference getVolts() {
            return UnitElectricPotentialDifference.INSTANCE.getVolts();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitElectricPotentialDifference(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitElectricPotentialDifference access$getKilovolts$cp() {
        return kilovolts;
    }

    public static final /* synthetic */ UnitElectricPotentialDifference access$getMegavolts$cp() {
        return megavolts;
    }

    public static final /* synthetic */ UnitElectricPotentialDifference access$getMicrovolts$cp() {
        return microvolts;
    }

    public static final /* synthetic */ UnitElectricPotentialDifference access$getMillivolts$cp() {
        return millivolts;
    }

    public static final /* synthetic */ UnitElectricPotentialDifference access$getVolts$cp() {
        return volts;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lskip/foundation/UnitElectricPotentialDifference$Companion;", "Lskip/foundation/UnitElectricPotentialDifference$CompanionClass;", "<init>", "()V", "megavolts", "Lskip/foundation/UnitElectricPotentialDifference;", "getMegavolts", "()Lskip/foundation/UnitElectricPotentialDifference;", "kilovolts", "getKilovolts", "volts", "getVolts", "millivolts", "getMillivolts", "microvolts", "getMicrovolts", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitElectricPotentialDifference.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getVolts();
        }

        @Override // skip.foundation.UnitElectricPotentialDifference.CompanionClass
        public UnitElectricPotentialDifference getKilovolts() {
            return UnitElectricPotentialDifference.access$getKilovolts$cp();
        }

        @Override // skip.foundation.UnitElectricPotentialDifference.CompanionClass
        public UnitElectricPotentialDifference getMegavolts() {
            return UnitElectricPotentialDifference.access$getMegavolts$cp();
        }

        @Override // skip.foundation.UnitElectricPotentialDifference.CompanionClass
        public UnitElectricPotentialDifference getMicrovolts() {
            return UnitElectricPotentialDifference.access$getMicrovolts$cp();
        }

        @Override // skip.foundation.UnitElectricPotentialDifference.CompanionClass
        public UnitElectricPotentialDifference getMillivolts() {
            return UnitElectricPotentialDifference.access$getMillivolts$cp();
        }

        @Override // skip.foundation.UnitElectricPotentialDifference.CompanionClass
        public UnitElectricPotentialDifference getVolts() {
            return UnitElectricPotentialDifference.access$getVolts$cp();
        }

        private Companion() {
        }
    }
}
