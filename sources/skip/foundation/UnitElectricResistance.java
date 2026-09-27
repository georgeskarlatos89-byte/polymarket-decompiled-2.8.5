package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitElectricResistance;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitElectricResistance extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitElectricResistance megaohms = new UnitElectricResistance("MΩ", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricResistance kiloohms = new UnitElectricResistance("kΩ", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricResistance ohms = new UnitElectricResistance("Ω", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricResistance milliohms = new UnitElectricResistance("mΩ", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitElectricResistance microohms = new UnitElectricResistance("µΩ", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lskip/foundation/UnitElectricResistance$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "megaohms", "Lskip/foundation/UnitElectricResistance;", "getMegaohms", "()Lskip/foundation/UnitElectricResistance;", "kiloohms", "getKiloohms", "ohms", "getOhms", "milliohms", "getMilliohms", "microohms", "getMicroohms", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitElectricResistance.INSTANCE.baseUnit();
        }

        public UnitElectricResistance getKiloohms() {
            return UnitElectricResistance.INSTANCE.getKiloohms();
        }

        public UnitElectricResistance getMegaohms() {
            return UnitElectricResistance.INSTANCE.getMegaohms();
        }

        public UnitElectricResistance getMicroohms() {
            return UnitElectricResistance.INSTANCE.getMicroohms();
        }

        public UnitElectricResistance getMilliohms() {
            return UnitElectricResistance.INSTANCE.getMilliohms();
        }

        public UnitElectricResistance getOhms() {
            return UnitElectricResistance.INSTANCE.getOhms();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitElectricResistance(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitElectricResistance access$getKiloohms$cp() {
        return kiloohms;
    }

    public static final /* synthetic */ UnitElectricResistance access$getMegaohms$cp() {
        return megaohms;
    }

    public static final /* synthetic */ UnitElectricResistance access$getMicroohms$cp() {
        return microohms;
    }

    public static final /* synthetic */ UnitElectricResistance access$getMilliohms$cp() {
        return milliohms;
    }

    public static final /* synthetic */ UnitElectricResistance access$getOhms$cp() {
        return ohms;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lskip/foundation/UnitElectricResistance$Companion;", "Lskip/foundation/UnitElectricResistance$CompanionClass;", "<init>", "()V", "megaohms", "Lskip/foundation/UnitElectricResistance;", "getMegaohms", "()Lskip/foundation/UnitElectricResistance;", "kiloohms", "getKiloohms", "ohms", "getOhms", "milliohms", "getMilliohms", "microohms", "getMicroohms", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitElectricResistance.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getOhms();
        }

        @Override // skip.foundation.UnitElectricResistance.CompanionClass
        public UnitElectricResistance getKiloohms() {
            return UnitElectricResistance.access$getKiloohms$cp();
        }

        @Override // skip.foundation.UnitElectricResistance.CompanionClass
        public UnitElectricResistance getMegaohms() {
            return UnitElectricResistance.access$getMegaohms$cp();
        }

        @Override // skip.foundation.UnitElectricResistance.CompanionClass
        public UnitElectricResistance getMicroohms() {
            return UnitElectricResistance.access$getMicroohms$cp();
        }

        @Override // skip.foundation.UnitElectricResistance.CompanionClass
        public UnitElectricResistance getMilliohms() {
            return UnitElectricResistance.access$getMilliohms$cp();
        }

        @Override // skip.foundation.UnitElectricResistance.CompanionClass
        public UnitElectricResistance getOhms() {
            return UnitElectricResistance.access$getOhms$cp();
        }

        private Companion() {
        }
    }
}
