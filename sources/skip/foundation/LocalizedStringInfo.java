package skip.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lskip/foundation/LocalizedStringInfo;", "", "string", "", "kotlinFormat", "markdownNode", "Lskip/foundation/MarkdownNode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lskip/foundation/MarkdownNode;)V", "getString", "()Ljava/lang/String;", "getKotlinFormat", "getMarkdownNode", "()Lskip/foundation/MarkdownNode;", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalizedStringInfo {
    private final String kotlinFormat;
    private final MarkdownNode markdownNode;
    private final String string;

    public LocalizedStringInfo(String str, String str2, MarkdownNode markdownNode) {
        str.getClass();
        str2.getClass();
        this.string = str;
        this.kotlinFormat = str2;
        this.markdownNode = markdownNode;
    }

    public final String getKotlinFormat() {
        return this.kotlinFormat;
    }

    public final MarkdownNode getMarkdownNode() {
        return this.markdownNode;
    }

    public final String getString() {
        return this.string;
    }

    public /* synthetic */ LocalizedStringInfo(String str, String str2, MarkdownNode markdownNode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : markdownNode);
    }
}
