package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h4e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ h4e[] $VALUES;
    public static final h4e ApiConnectionError;
    public static final h4e ApiError;
    public static final h4e AuthenticationError;
    public static final h4e CardError;
    public static final g4e Companion;
    public static final h4e IdempotencyError;
    public static final h4e InvalidRequestError;
    public static final h4e RateLimitError;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [g4e, java.lang.Object] */
    static {
        h4e h4eVar = new h4e("ApiConnectionError", 0, "api_connection_error");
        ApiConnectionError = h4eVar;
        h4e h4eVar2 = new h4e("ApiError", 1, "api_error");
        ApiError = h4eVar2;
        h4e h4eVar3 = new h4e("AuthenticationError", 2, "authentication_error");
        AuthenticationError = h4eVar3;
        h4e h4eVar4 = new h4e("CardError", 3, "card_error");
        CardError = h4eVar4;
        h4e h4eVar5 = new h4e("IdempotencyError", 4, "idempotency_error");
        IdempotencyError = h4eVar5;
        h4e h4eVar6 = new h4e("InvalidRequestError", 5, "invalid_request_error");
        InvalidRequestError = h4eVar6;
        h4e h4eVar7 = new h4e("RateLimitError", 6, "rate_limit_error");
        RateLimitError = h4eVar7;
        h4e[] h4eVarArr = {h4eVar, h4eVar2, h4eVar3, h4eVar4, h4eVar5, h4eVar6, h4eVar7};
        $VALUES = h4eVarArr;
        $ENTRIES = new wg7(h4eVarArr);
        Companion = new Object();
    }

    public h4e(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static h4e valueOf(String str) {
        return (h4e) Enum.valueOf(h4e.class, str);
    }

    public static h4e[] values() {
        return (h4e[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
