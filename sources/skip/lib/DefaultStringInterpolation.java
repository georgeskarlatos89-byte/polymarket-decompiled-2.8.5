package skip.lib;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u001b\u0010\u0011\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u0002H\u0012H\u0016¢\u0006\u0002\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lskip/lib/DefaultStringInterpolation;", "Lskip/lib/StringInterpolationProtocol;", "literalCapacity", "", "interpolationCount", "<init>", "(II)V", "values", "", "", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "appendLiteral", "", "literal", "appendInterpolation", "T", "value", "(Ljava/lang/Object;)V", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultStringInterpolation implements StringInterpolationProtocol {
    private List<String> values = new ArrayList();

    public DefaultStringInterpolation(int i, int i2) {
    }

    @Override // skip.lib.StringInterpolationProtocol
    public <T> void appendInterpolation(T value) {
        this.values.add(String.valueOf(value));
    }

    @Override // skip.lib.StringInterpolationProtocol
    public void appendLiteral(String literal) {
        literal.getClass();
        this.values.add(literal);
    }

    public final List<String> getValues() {
        return this.values;
    }

    public final void setValues(List<String> list) {
        list.getClass();
        this.values = list;
    }
}
