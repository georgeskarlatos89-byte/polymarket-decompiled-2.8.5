package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk91;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class k91 extends Exception {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(String str) {
        super(str);
        str.getClass();
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
