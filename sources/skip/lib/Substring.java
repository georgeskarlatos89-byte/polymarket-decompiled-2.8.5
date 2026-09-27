package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lskip/lib/Substring;", "", "stringValue", "", "startIndex", "", "<init>", "(Ljava/lang/String;I)V", "getStringValue", "()Ljava/lang/String;", "getStartIndex", "()I", "toString", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Substring {
    private final int startIndex;
    private final String stringValue;

    public Substring(String str, int i) {
        str.getClass();
        this.stringValue = str;
        this.startIndex = i;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public String toString() {
        return this.stringValue;
    }
}
