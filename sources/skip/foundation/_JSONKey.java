package skip.foundation;

import defpackage.ace;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.CodingKey;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\n\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tB\u001d\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, d2 = {"Lskip/foundation/_JSONKey;", "Lskip/lib/CodingKey;", "stringValue", "", "<init>", "(Ljava/lang/String;)V", "intValue", "", "(I)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "index", "unusedp_0", "", "(ILjava/lang/Void;)V", "getStringValue", "()Ljava/lang/String;", "getIntValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "rawValue", "getRawValue", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _JSONKey implements CodingKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final _JSONKey _super = new _JSONKey("super");
    private final Integer intValue;
    private final String stringValue;

    public _JSONKey(int i, Void r2) {
        this.stringValue = ace.f(i, "Index ");
        this.intValue = Integer.valueOf(i);
    }

    public static final /* synthetic */ _JSONKey access$get_super$cp() {
        return _super;
    }

    @Override // skip.lib.CodingKey, skip.lib.CustomDebugStringConvertible
    public String getDebugDescription() {
        return super.getDebugDescription();
    }

    @Override // skip.lib.CodingKey
    public String getDescription() {
        return super.getDescription();
    }

    @Override // skip.lib.CodingKey
    public Integer getIntValue() {
        return this.intValue;
    }

    @Override // skip.lib.CodingKey
    public String getRawValue() {
        return getStringValue();
    }

    @Override // skip.lib.CodingKey
    public String getStringValue() {
        return this.stringValue;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lskip/foundation/_JSONKey$Companion;", "", "<init>", "()V", "_super", "Lskip/foundation/_JSONKey;", "get_super$SkipFoundation", "()Lskip/foundation/_JSONKey;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final _JSONKey get_super$SkipFoundation() {
            return _JSONKey.access$get_super$cp();
        }

        private Companion() {
        }
    }

    public _JSONKey(int i) {
        this.stringValue = String.valueOf(i);
        this.intValue = Integer.valueOf(i);
    }

    public _JSONKey(String str, Integer num) {
        str.getClass();
        this.stringValue = str;
        this.intValue = num;
    }

    public _JSONKey(String str) {
        str.getClass();
        this.stringValue = str;
        this.intValue = null;
    }

    public /* synthetic */ _JSONKey(int i, Void r2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : r2);
    }
}
