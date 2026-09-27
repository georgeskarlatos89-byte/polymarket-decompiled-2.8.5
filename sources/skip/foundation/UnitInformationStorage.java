package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitInformationStorage;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitInformationStorage extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitInformationStorage bytes = new UnitInformationStorage("B", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage bits = new UnitInformationStorage("bit", new UnitConverterLinear(0.125d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage nibbles = new UnitInformationStorage("nibble", new UnitConverterLinear(0.5d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage yottabytes = new UnitInformationStorage("YB", new UnitConverterLinear(1.0E24d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage zettabytes = new UnitInformationStorage("ZB", new UnitConverterLinear(1.0E21d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage exabytes = new UnitInformationStorage("EB", new UnitConverterLinear(1.0E18d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage petabytes = new UnitInformationStorage("PB", new UnitConverterLinear(1.0E15d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage terabytes = new UnitInformationStorage("TB", new UnitConverterLinear(1.0E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage gigabytes = new UnitInformationStorage("GB", new UnitConverterLinear(1.0E9d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage megabytes = new UnitInformationStorage("MB", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage kilobytes = new UnitInformationStorage("kB", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage yottabits = new UnitInformationStorage("Yb", new UnitConverterLinear(1.25E23d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage zettabits = new UnitInformationStorage("Zb", new UnitConverterLinear(1.25E20d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage exabits = new UnitInformationStorage("Eb", new UnitConverterLinear(1.25E17d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage petabits = new UnitInformationStorage("Pb", new UnitConverterLinear(1.25E14d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage terabits = new UnitInformationStorage("Tb", new UnitConverterLinear(1.25E11d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage gigabits = new UnitInformationStorage("Gb", new UnitConverterLinear(1.25E8d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage megabits = new UnitInformationStorage("Mb", new UnitConverterLinear(125000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage kilobits = new UnitInformationStorage("kb", new UnitConverterLinear(125.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage yobibytes = new UnitInformationStorage("YiB", new UnitConverterLinear(1.2089258196146292E24d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage zebibytes = new UnitInformationStorage("ZiB", new UnitConverterLinear(1.1805916207174113E21d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage exbibytes = new UnitInformationStorage("EiB", new UnitConverterLinear(1.15292150460684698E18d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage pebibytes = new UnitInformationStorage("PiB", new UnitConverterLinear(1.125899906842624E15d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage tebibytes = new UnitInformationStorage("TiB", new UnitConverterLinear(1.099511627776E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage gibibytes = new UnitInformationStorage("GiB", new UnitConverterLinear(1.073741824E9d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage mebibytes = new UnitInformationStorage("MiB", new UnitConverterLinear(1048576.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage kibibytes = new UnitInformationStorage("KiB", new UnitConverterLinear(1024.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage yobibits = new UnitInformationStorage("Yib", new UnitConverterLinear(1.5111572745182865E23d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage zebibits = new UnitInformationStorage("Zib", new UnitConverterLinear(1.4757395258967641E20d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage exbibits = new UnitInformationStorage("Eib", new UnitConverterLinear(1.44115188075855872E17d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage pebibits = new UnitInformationStorage("Pib", new UnitConverterLinear(1.40737488355328E14d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage tebibits = new UnitInformationStorage("Tib", new UnitConverterLinear(1.37438953472E11d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage gibibits = new UnitInformationStorage("Gib", new UnitConverterLinear(1.34217728E8d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage mebibits = new UnitInformationStorage("Mib", new UnitConverterLinear(131072.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitInformationStorage kibibits = new UnitInformationStorage("Kib", new UnitConverterLinear(128.0d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010L\u001a\u00020MH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0007R\u0014\u0010F\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0007R\u0014\u0010H\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0007R\u0014\u0010J\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0007¨\u0006N"}, d2 = {"Lskip/foundation/UnitInformationStorage$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "bytes", "Lskip/foundation/UnitInformationStorage;", "getBytes", "()Lskip/foundation/UnitInformationStorage;", "bits", "getBits", "nibbles", "getNibbles", "yottabytes", "getYottabytes", "zettabytes", "getZettabytes", "exabytes", "getExabytes", "petabytes", "getPetabytes", "terabytes", "getTerabytes", "gigabytes", "getGigabytes", "megabytes", "getMegabytes", "kilobytes", "getKilobytes", "yottabits", "getYottabits", "zettabits", "getZettabits", "exabits", "getExabits", "petabits", "getPetabits", "terabits", "getTerabits", "gigabits", "getGigabits", "megabits", "getMegabits", "kilobits", "getKilobits", "yobibytes", "getYobibytes", "zebibytes", "getZebibytes", "exbibytes", "getExbibytes", "pebibytes", "getPebibytes", "tebibytes", "getTebibytes", "gibibytes", "getGibibytes", "mebibytes", "getMebibytes", "kibibytes", "getKibibytes", "yobibits", "getYobibits", "zebibits", "getZebibits", "exbibits", "getExbibits", "pebibits", "getPebibits", "tebibits", "getTebibits", "gibibits", "getGibibits", "mebibits", "getMebibits", "kibibits", "getKibibits", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitInformationStorage.INSTANCE.baseUnit();
        }

        public UnitInformationStorage getBits() {
            return UnitInformationStorage.INSTANCE.getBits();
        }

        public UnitInformationStorage getBytes() {
            return UnitInformationStorage.INSTANCE.getBytes();
        }

        public UnitInformationStorage getExabits() {
            return UnitInformationStorage.INSTANCE.getExabits();
        }

        public UnitInformationStorage getExabytes() {
            return UnitInformationStorage.INSTANCE.getExabytes();
        }

        public UnitInformationStorage getExbibits() {
            return UnitInformationStorage.INSTANCE.getExbibits();
        }

        public UnitInformationStorage getExbibytes() {
            return UnitInformationStorage.INSTANCE.getExbibytes();
        }

        public UnitInformationStorage getGibibits() {
            return UnitInformationStorage.INSTANCE.getGibibits();
        }

        public UnitInformationStorage getGibibytes() {
            return UnitInformationStorage.INSTANCE.getGibibytes();
        }

        public UnitInformationStorage getGigabits() {
            return UnitInformationStorage.INSTANCE.getGigabits();
        }

        public UnitInformationStorage getGigabytes() {
            return UnitInformationStorage.INSTANCE.getGigabytes();
        }

        public UnitInformationStorage getKibibits() {
            return UnitInformationStorage.INSTANCE.getKibibits();
        }

        public UnitInformationStorage getKibibytes() {
            return UnitInformationStorage.INSTANCE.getKibibytes();
        }

        public UnitInformationStorage getKilobits() {
            return UnitInformationStorage.INSTANCE.getKilobits();
        }

        public UnitInformationStorage getKilobytes() {
            return UnitInformationStorage.INSTANCE.getKilobytes();
        }

        public UnitInformationStorage getMebibits() {
            return UnitInformationStorage.INSTANCE.getMebibits();
        }

        public UnitInformationStorage getMebibytes() {
            return UnitInformationStorage.INSTANCE.getMebibytes();
        }

        public UnitInformationStorage getMegabits() {
            return UnitInformationStorage.INSTANCE.getMegabits();
        }

        public UnitInformationStorage getMegabytes() {
            return UnitInformationStorage.INSTANCE.getMegabytes();
        }

        public UnitInformationStorage getNibbles() {
            return UnitInformationStorage.INSTANCE.getNibbles();
        }

        public UnitInformationStorage getPebibits() {
            return UnitInformationStorage.INSTANCE.getPebibits();
        }

        public UnitInformationStorage getPebibytes() {
            return UnitInformationStorage.INSTANCE.getPebibytes();
        }

        public UnitInformationStorage getPetabits() {
            return UnitInformationStorage.INSTANCE.getPetabits();
        }

        public UnitInformationStorage getPetabytes() {
            return UnitInformationStorage.INSTANCE.getPetabytes();
        }

        public UnitInformationStorage getTebibits() {
            return UnitInformationStorage.INSTANCE.getTebibits();
        }

        public UnitInformationStorage getTebibytes() {
            return UnitInformationStorage.INSTANCE.getTebibytes();
        }

        public UnitInformationStorage getTerabits() {
            return UnitInformationStorage.INSTANCE.getTerabits();
        }

        public UnitInformationStorage getTerabytes() {
            return UnitInformationStorage.INSTANCE.getTerabytes();
        }

        public UnitInformationStorage getYobibits() {
            return UnitInformationStorage.INSTANCE.getYobibits();
        }

        public UnitInformationStorage getYobibytes() {
            return UnitInformationStorage.INSTANCE.getYobibytes();
        }

        public UnitInformationStorage getYottabits() {
            return UnitInformationStorage.INSTANCE.getYottabits();
        }

        public UnitInformationStorage getYottabytes() {
            return UnitInformationStorage.INSTANCE.getYottabytes();
        }

        public UnitInformationStorage getZebibits() {
            return UnitInformationStorage.INSTANCE.getZebibits();
        }

        public UnitInformationStorage getZebibytes() {
            return UnitInformationStorage.INSTANCE.getZebibytes();
        }

        public UnitInformationStorage getZettabits() {
            return UnitInformationStorage.INSTANCE.getZettabits();
        }

        public UnitInformationStorage getZettabytes() {
            return UnitInformationStorage.INSTANCE.getZettabytes();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitInformationStorage(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitInformationStorage access$getBits$cp() {
        return bits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getBytes$cp() {
        return bytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getExabits$cp() {
        return exabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getExabytes$cp() {
        return exabytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getExbibits$cp() {
        return exbibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getExbibytes$cp() {
        return exbibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getGibibits$cp() {
        return gibibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getGibibytes$cp() {
        return gibibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getGigabits$cp() {
        return gigabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getGigabytes$cp() {
        return gigabytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getKibibits$cp() {
        return kibibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getKibibytes$cp() {
        return kibibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getKilobits$cp() {
        return kilobits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getKilobytes$cp() {
        return kilobytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getMebibits$cp() {
        return mebibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getMebibytes$cp() {
        return mebibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getMegabits$cp() {
        return megabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getMegabytes$cp() {
        return megabytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getNibbles$cp() {
        return nibbles;
    }

    public static final /* synthetic */ UnitInformationStorage access$getPebibits$cp() {
        return pebibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getPebibytes$cp() {
        return pebibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getPetabits$cp() {
        return petabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getPetabytes$cp() {
        return petabytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getTebibits$cp() {
        return tebibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getTebibytes$cp() {
        return tebibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getTerabits$cp() {
        return terabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getTerabytes$cp() {
        return terabytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getYobibits$cp() {
        return yobibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getYobibytes$cp() {
        return yobibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getYottabits$cp() {
        return yottabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getYottabytes$cp() {
        return yottabytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getZebibits$cp() {
        return zebibits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getZebibytes$cp() {
        return zebibytes;
    }

    public static final /* synthetic */ UnitInformationStorage access$getZettabits$cp() {
        return zettabits;
    }

    public static final /* synthetic */ UnitInformationStorage access$getZettabytes$cp() {
        return zettabytes;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010L\u001a\u00020MH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007R\u0014\u0010F\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0007R\u0014\u0010H\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0007R\u0014\u0010J\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007¨\u0006N"}, d2 = {"Lskip/foundation/UnitInformationStorage$Companion;", "Lskip/foundation/UnitInformationStorage$CompanionClass;", "<init>", "()V", "bytes", "Lskip/foundation/UnitInformationStorage;", "getBytes", "()Lskip/foundation/UnitInformationStorage;", "bits", "getBits", "nibbles", "getNibbles", "yottabytes", "getYottabytes", "zettabytes", "getZettabytes", "exabytes", "getExabytes", "petabytes", "getPetabytes", "terabytes", "getTerabytes", "gigabytes", "getGigabytes", "megabytes", "getMegabytes", "kilobytes", "getKilobytes", "yottabits", "getYottabits", "zettabits", "getZettabits", "exabits", "getExabits", "petabits", "getPetabits", "terabits", "getTerabits", "gigabits", "getGigabits", "megabits", "getMegabits", "kilobits", "getKilobits", "yobibytes", "getYobibytes", "zebibytes", "getZebibytes", "exbibytes", "getExbibytes", "pebibytes", "getPebibytes", "tebibytes", "getTebibytes", "gibibytes", "getGibibytes", "mebibytes", "getMebibytes", "kibibytes", "getKibibytes", "yobibits", "getYobibits", "zebibits", "getZebibits", "exbibits", "getExbibits", "pebibits", "getPebibits", "tebibits", "getTebibits", "gibibits", "getGibibits", "mebibits", "getMebibits", "kibibits", "getKibibits", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getBytes();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getBits() {
            return UnitInformationStorage.access$getBits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getBytes() {
            return UnitInformationStorage.access$getBytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getExabits() {
            return UnitInformationStorage.access$getExabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getExabytes() {
            return UnitInformationStorage.access$getExabytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getExbibits() {
            return UnitInformationStorage.access$getExbibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getExbibytes() {
            return UnitInformationStorage.access$getExbibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getGibibits() {
            return UnitInformationStorage.access$getGibibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getGibibytes() {
            return UnitInformationStorage.access$getGibibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getGigabits() {
            return UnitInformationStorage.access$getGigabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getGigabytes() {
            return UnitInformationStorage.access$getGigabytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getKibibits() {
            return UnitInformationStorage.access$getKibibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getKibibytes() {
            return UnitInformationStorage.access$getKibibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getKilobits() {
            return UnitInformationStorage.access$getKilobits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getKilobytes() {
            return UnitInformationStorage.access$getKilobytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getMebibits() {
            return UnitInformationStorage.access$getMebibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getMebibytes() {
            return UnitInformationStorage.access$getMebibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getMegabits() {
            return UnitInformationStorage.access$getMegabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getMegabytes() {
            return UnitInformationStorage.access$getMegabytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getNibbles() {
            return UnitInformationStorage.access$getNibbles$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getPebibits() {
            return UnitInformationStorage.access$getPebibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getPebibytes() {
            return UnitInformationStorage.access$getPebibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getPetabits() {
            return UnitInformationStorage.access$getPetabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getPetabytes() {
            return UnitInformationStorage.access$getPetabytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getTebibits() {
            return UnitInformationStorage.access$getTebibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getTebibytes() {
            return UnitInformationStorage.access$getTebibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getTerabits() {
            return UnitInformationStorage.access$getTerabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getTerabytes() {
            return UnitInformationStorage.access$getTerabytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getYobibits() {
            return UnitInformationStorage.access$getYobibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getYobibytes() {
            return UnitInformationStorage.access$getYobibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getYottabits() {
            return UnitInformationStorage.access$getYottabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getYottabytes() {
            return UnitInformationStorage.access$getYottabytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getZebibits() {
            return UnitInformationStorage.access$getZebibits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getZebibytes() {
            return UnitInformationStorage.access$getZebibytes$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getZettabits() {
            return UnitInformationStorage.access$getZettabits$cp();
        }

        @Override // skip.foundation.UnitInformationStorage.CompanionClass
        public UnitInformationStorage getZettabytes() {
            return UnitInformationStorage.access$getZettabytes$cp();
        }

        private Companion() {
        }
    }
}
