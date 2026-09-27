package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.foundation.Dimension;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lskip/foundation/UnitTemperature;", "Lskip/foundation/Dimension;", "symbol", "", "converter", "Lskip/foundation/UnitConverter;", "<init>", "(Ljava/lang/String;Lskip/foundation/UnitConverter;)V", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class UnitTemperature extends Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final UnitTemperature kelvin = new UnitTemperature("K", new UnitConverterLinear(1.0d, ConstantsKt.UNSET));
    private static final UnitTemperature celsius = new UnitTemperature("°C", new UnitConverterLinear(1.0d, 273.15d));
    private static final UnitTemperature fahrenheit = new UnitTemperature("°F", new UnitConverterLinear(0.5555555555555556d, 255.37222222222428d));

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lskip/foundation/UnitTemperature$CompanionClass;", "Lskip/foundation/Dimension$CompanionClass;", "<init>", "()V", "kelvin", "Lskip/foundation/UnitTemperature;", "getKelvin", "()Lskip/foundation/UnitTemperature;", "celsius", "getCelsius", "fahrenheit", "getFahrenheit", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass extends Dimension.CompanionClass {
        @Override // skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return UnitTemperature.INSTANCE.baseUnit();
        }

        public UnitTemperature getCelsius() {
            return UnitTemperature.INSTANCE.getCelsius();
        }

        public UnitTemperature getFahrenheit() {
            return UnitTemperature.INSTANCE.getFahrenheit();
        }

        public UnitTemperature getKelvin() {
            return UnitTemperature.INSTANCE.getKelvin();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitTemperature(String str, UnitConverter unitConverter) {
        super(str, unitConverter);
        str.getClass();
        unitConverter.getClass();
    }

    public static final /* synthetic */ UnitTemperature access$getCelsius$cp() {
        return celsius;
    }

    public static final /* synthetic */ UnitTemperature access$getFahrenheit$cp() {
        return fahrenheit;
    }

    public static final /* synthetic */ UnitTemperature access$getKelvin$cp() {
        return kelvin;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lskip/foundation/UnitTemperature$Companion;", "Lskip/foundation/UnitTemperature$CompanionClass;", "<init>", "()V", "kelvin", "Lskip/foundation/UnitTemperature;", "getKelvin", "()Lskip/foundation/UnitTemperature;", "celsius", "getCelsius", "fahrenheit", "getFahrenheit", "baseUnit", "Lskip/foundation/Dimension;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion extends CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // skip.foundation.UnitTemperature.CompanionClass, skip.foundation.Dimension.CompanionClass
        public Dimension baseUnit() {
            return getKelvin();
        }

        @Override // skip.foundation.UnitTemperature.CompanionClass
        public UnitTemperature getCelsius() {
            return UnitTemperature.access$getCelsius$cp();
        }

        @Override // skip.foundation.UnitTemperature.CompanionClass
        public UnitTemperature getFahrenheit() {
            return UnitTemperature.access$getFahrenheit$cp();
        }

        @Override // skip.foundation.UnitTemperature.CompanionClass
        public UnitTemperature getKelvin() {
            return UnitTemperature.access$getKelvin$cp();
        }

        private Companion() {
        }
    }
}
