package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitElectricCharge;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitElectricCharge extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitElectricCharge coulombs = new UnitElectricCharge("C", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricCharge megaampereHours = new UnitElectricCharge("MAh", new UnitConverterLinear(3.6E9d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricCharge kiloampereHours = new UnitElectricCharge("kAh", new UnitConverterLinear(3600000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricCharge ampereHours = new UnitElectricCharge("Ah", new UnitConverterLinear(3600.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricCharge milliampereHours = new UnitElectricCharge("mAh", new UnitConverterLinear(3.6d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricCharge microampereHours = new UnitElectricCharge("µAh", new UnitConverterLinear(0.0036d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0014"}, d2 = {"Lskip/foundation/UnitElectricCharge$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "coulombs", "Lskip/foundation/UnitElectricCharge;", "getCoulombs", "()Lskip/foundation/UnitElectricCharge;", "megaampereHours", "getMegaampereHours", "kiloampereHours", "getKiloampereHours", "ampereHours", "getAmpereHours", "milliampereHours", "getMilliampereHours", "microampereHours", "getMicroampereHours", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitElectricCharge.INSTANCE.baseUnit();
        }

        public UnitElectricCharge getAmpereHours() {
            return UnitElectricCharge.INSTANCE.getAmpereHours();
        }

        public UnitElectricCharge getCoulombs() {
            return UnitElectricCharge.INSTANCE.getCoulombs();
        }

        public UnitElectricCharge getKiloampereHours() {
            return UnitElectricCharge.INSTANCE.getKiloampereHours();
        }

        public UnitElectricCharge getMegaampereHours() {
            return UnitElectricCharge.INSTANCE.getMegaampereHours();
        }

        public UnitElectricCharge getMicroampereHours() {
            return UnitElectricCharge.INSTANCE.getMicroampereHours();
        }

        public UnitElectricCharge getMilliampereHours() {
            return UnitElectricCharge.INSTANCE.getMilliampereHours();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitElectricCharge(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitElectricCharge access$getAmpereHours$cp() {
        return ampereHours;
    }

    public static final /* synthetic */ UnitElectricCharge access$getCoulombs$cp() {
        return coulombs;
    }

    public static final /* synthetic */ UnitElectricCharge access$getKiloampereHours$cp() {
        return kiloampereHours;
    }

    public static final /* synthetic */ UnitElectricCharge access$getMegaampereHours$cp() {
        return megaampereHours;
    }

    public static final /* synthetic */ UnitElectricCharge access$getMicroampereHours$cp() {
        return microampereHours;
    }

    public static final /* synthetic */ UnitElectricCharge access$getMilliampereHours$cp() {
        return milliampereHours;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0014"}, d2 = {"Lskip/foundation/UnitElectricCharge$Companion;", "Lskip/foundation/UnitElectricCharge$CompanionClass;", "<init>", "()V", "coulombs", "Lskip/foundation/UnitElectricCharge;", "getCoulombs", "()Lskip/foundation/UnitElectricCharge;", "megaampereHours", "getMegaampereHours", "kiloampereHours", "getKiloampereHours", "ampereHours", "getAmpereHours", "milliampereHours", "getMilliampereHours", "microampereHours", "getMicroampereHours", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getCoulombs();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass
        public UnitElectricCharge getAmpereHours() {
            return UnitElectricCharge.access$getAmpereHours$cp();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass
        public UnitElectricCharge getCoulombs() {
            return UnitElectricCharge.access$getCoulombs$cp();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass
        public UnitElectricCharge getKiloampereHours() {
            return UnitElectricCharge.access$getKiloampereHours$cp();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass
        public UnitElectricCharge getMegaampereHours() {
            return UnitElectricCharge.access$getMegaampereHours$cp();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass
        public UnitElectricCharge getMicroampereHours() {
            return UnitElectricCharge.access$getMicroampereHours$cp();
        }

        @Override // skip.foundation.UnitElectricCharge.CompanionClass
        public UnitElectricCharge getMilliampereHours() {
            return UnitElectricCharge.access$getMilliampereHours$cp();
        }

        private Companion() {
        }
    }
}
