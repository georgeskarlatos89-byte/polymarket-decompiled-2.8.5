package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitPower;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitPower extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitPower terawatts = new UnitPower("TW", new UnitConverterLinear(1.0E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower gigawatts = new UnitPower("GW", new UnitConverterLinear(1.0E9d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower megawatts = new UnitPower("MW", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower kilowatts = new UnitPower("kW", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower watts = new UnitPower("W", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower milliwatts = new UnitPower("mW", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower microwatts = new UnitPower("µW", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower nanowatts = new UnitPower("nW", new UnitConverterLinear(1.0E-9d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower picowatts = new UnitPower("pW", new UnitConverterLinear(1.0E-12d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower femtowatts = new UnitPower("fW", new UnitConverterLinear(1.0E-15d, ConstantsKt.UNSET, 2, null));
    private static final UnitPower horsepower = new UnitPower("hp", new UnitConverterLinear(745.7d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lskip/foundation/UnitPower$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "terawatts", "Lskip/foundation/UnitPower;", "getTerawatts", "()Lskip/foundation/UnitPower;", "gigawatts", "getGigawatts", "megawatts", "getMegawatts", "kilowatts", "getKilowatts", "watts", "getWatts", "milliwatts", "getMilliwatts", "microwatts", "getMicrowatts", "nanowatts", "getNanowatts", "picowatts", "getPicowatts", "femtowatts", "getFemtowatts", "horsepower", "getHorsepower", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitPower.INSTANCE.baseUnit();
        }

        public UnitPower getFemtowatts() {
            return UnitPower.INSTANCE.getFemtowatts();
        }

        public UnitPower getGigawatts() {
            return UnitPower.INSTANCE.getGigawatts();
        }

        public UnitPower getHorsepower() {
            return UnitPower.INSTANCE.getHorsepower();
        }

        public UnitPower getKilowatts() {
            return UnitPower.INSTANCE.getKilowatts();
        }

        public UnitPower getMegawatts() {
            return UnitPower.INSTANCE.getMegawatts();
        }

        public UnitPower getMicrowatts() {
            return UnitPower.INSTANCE.getMicrowatts();
        }

        public UnitPower getMilliwatts() {
            return UnitPower.INSTANCE.getMilliwatts();
        }

        public UnitPower getNanowatts() {
            return UnitPower.INSTANCE.getNanowatts();
        }

        public UnitPower getPicowatts() {
            return UnitPower.INSTANCE.getPicowatts();
        }

        public UnitPower getTerawatts() {
            return UnitPower.INSTANCE.getTerawatts();
        }

        public UnitPower getWatts() {
            return UnitPower.INSTANCE.getWatts();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitPower(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitPower access$getFemtowatts$cp() {
        return femtowatts;
    }

    public static final /* synthetic */ UnitPower access$getGigawatts$cp() {
        return gigawatts;
    }

    public static final /* synthetic */ UnitPower access$getHorsepower$cp() {
        return horsepower;
    }

    public static final /* synthetic */ UnitPower access$getKilowatts$cp() {
        return kilowatts;
    }

    public static final /* synthetic */ UnitPower access$getMegawatts$cp() {
        return megawatts;
    }

    public static final /* synthetic */ UnitPower access$getMicrowatts$cp() {
        return microwatts;
    }

    public static final /* synthetic */ UnitPower access$getMilliwatts$cp() {
        return milliwatts;
    }

    public static final /* synthetic */ UnitPower access$getNanowatts$cp() {
        return nanowatts;
    }

    public static final /* synthetic */ UnitPower access$getPicowatts$cp() {
        return picowatts;
    }

    public static final /* synthetic */ UnitPower access$getTerawatts$cp() {
        return terawatts;
    }

    public static final /* synthetic */ UnitPower access$getWatts$cp() {
        return watts;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001e"}, d2 = {"Lskip/foundation/UnitPower$Companion;", "Lskip/foundation/UnitPower$CompanionClass;", "<init>", "()V", "terawatts", "Lskip/foundation/UnitPower;", "getTerawatts", "()Lskip/foundation/UnitPower;", "gigawatts", "getGigawatts", "megawatts", "getMegawatts", "kilowatts", "getKilowatts", "watts", "getWatts", "milliwatts", "getMilliwatts", "microwatts", "getMicrowatts", "nanowatts", "getNanowatts", "picowatts", "getPicowatts", "femtowatts", "getFemtowatts", "horsepower", "getHorsepower", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitPower.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getWatts();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getFemtowatts() {
            return UnitPower.access$getFemtowatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getGigawatts() {
            return UnitPower.access$getGigawatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getHorsepower() {
            return UnitPower.access$getHorsepower$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getKilowatts() {
            return UnitPower.access$getKilowatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getMegawatts() {
            return UnitPower.access$getMegawatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getMicrowatts() {
            return UnitPower.access$getMicrowatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getMilliwatts() {
            return UnitPower.access$getMilliwatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getNanowatts() {
            return UnitPower.access$getNanowatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getPicowatts() {
            return UnitPower.access$getPicowatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getTerawatts() {
            return UnitPower.access$getTerawatts$cp();
        }

        @Override // skip.foundation.UnitPower.CompanionClass
        public UnitPower getWatts() {
            return UnitPower.access$getWatts$cp();
        }

        private Companion() {
        }
    }
}
