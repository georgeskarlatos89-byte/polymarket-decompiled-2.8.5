package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitFrequency;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitFrequency extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitFrequency terahertz = new UnitFrequency("THz", new UnitConverterLinear(1.0E12d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency gigahertz = new UnitFrequency("GHz", new UnitConverterLinear(1.0E9d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency megahertz = new UnitFrequency("MHz", new UnitConverterLinear(1000000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency kilohertz = new UnitFrequency("kHz", new UnitConverterLinear(1000.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency hertz = new UnitFrequency("Hz", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency millihertz = new UnitFrequency("mHz", new UnitConverterLinear(0.001d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency microhertz = new UnitFrequency("µHz", new UnitConverterLinear(1.0E-6d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency nanohertz = new UnitFrequency("nHz", new UnitConverterLinear(1.0E-9d, ConstantsKt.UNSET, 2, null));
    private static final UnitFrequency framesPerSecond = new UnitFrequency("fps", new UnitConverterLinear(1.0d, ConstantsKt.UNSET, 2, null));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lskip/foundation/UnitFrequency$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "terahertz", "Lskip/foundation/UnitFrequency;", "getTerahertz", "()Lskip/foundation/UnitFrequency;", "gigahertz", "getGigahertz", "megahertz", "getMegahertz", "kilohertz", "getKilohertz", "hertz", "getHertz", "millihertz", "getMillihertz", "microhertz", "getMicrohertz", "nanohertz", "getNanohertz", "framesPerSecond", "getFramesPerSecond", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitFrequency.INSTANCE.baseUnit();
        }

        public UnitFrequency getFramesPerSecond() {
            return UnitFrequency.INSTANCE.getFramesPerSecond();
        }

        public UnitFrequency getGigahertz() {
            return UnitFrequency.INSTANCE.getGigahertz();
        }

        public UnitFrequency getHertz() {
            return UnitFrequency.INSTANCE.getHertz();
        }

        public UnitFrequency getKilohertz() {
            return UnitFrequency.INSTANCE.getKilohertz();
        }

        public UnitFrequency getMegahertz() {
            return UnitFrequency.INSTANCE.getMegahertz();
        }

        public UnitFrequency getMicrohertz() {
            return UnitFrequency.INSTANCE.getMicrohertz();
        }

        public UnitFrequency getMillihertz() {
            return UnitFrequency.INSTANCE.getMillihertz();
        }

        public UnitFrequency getNanohertz() {
            return UnitFrequency.INSTANCE.getNanohertz();
        }

        public UnitFrequency getTerahertz() {
            return UnitFrequency.INSTANCE.getTerahertz();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitFrequency(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitFrequency access$getFramesPerSecond$cp() {
        return framesPerSecond;
    }

    public static final /* synthetic */ UnitFrequency access$getGigahertz$cp() {
        return gigahertz;
    }

    public static final /* synthetic */ UnitFrequency access$getHertz$cp() {
        return hertz;
    }

    public static final /* synthetic */ UnitFrequency access$getKilohertz$cp() {
        return kilohertz;
    }

    public static final /* synthetic */ UnitFrequency access$getMegahertz$cp() {
        return megahertz;
    }

    public static final /* synthetic */ UnitFrequency access$getMicrohertz$cp() {
        return microhertz;
    }

    public static final /* synthetic */ UnitFrequency access$getMillihertz$cp() {
        return millihertz;
    }

    public static final /* synthetic */ UnitFrequency access$getNanohertz$cp() {
        return nanohertz;
    }

    public static final /* synthetic */ UnitFrequency access$getTerahertz$cp() {
        return terahertz;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lskip/foundation/UnitFrequency$Companion;", "Lskip/foundation/UnitFrequency$CompanionClass;", "<init>", "()V", "terahertz", "Lskip/foundation/UnitFrequency;", "getTerahertz", "()Lskip/foundation/UnitFrequency;", "gigahertz", "getGigahertz", "megahertz", "getMegahertz", "kilohertz", "getKilohertz", "hertz", "getHertz", "millihertz", "getMillihertz", "microhertz", "getMicrohertz", "nanohertz", "getNanohertz", "framesPerSecond", "getFramesPerSecond", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getHertz();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getFramesPerSecond() {
            return UnitFrequency.access$getFramesPerSecond$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getGigahertz() {
            return UnitFrequency.access$getGigahertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getHertz() {
            return UnitFrequency.access$getHertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getKilohertz() {
            return UnitFrequency.access$getKilohertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getMegahertz() {
            return UnitFrequency.access$getMegahertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getMicrohertz() {
            return UnitFrequency.access$getMicrohertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getMillihertz() {
            return UnitFrequency.access$getMillihertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getNanohertz() {
            return UnitFrequency.access$getNanohertz$cp();
        }

        @Override // skip.foundation.UnitFrequency.CompanionClass
        public UnitFrequency getTerahertz() {
            return UnitFrequency.access$getTerahertz$cp();
        }

        private Companion() {
        }
    }
}
