package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j0h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ j0h[] $VALUES;
    public static final j0h ApiConnectionError;
    public static final j0h ApiError;
    public static final j0h AuthenticationError;
    public static final j0h CardError;
    public static final i0h Companion;
    public static final j0h IdempotencyError;
    public static final j0h InvalidRequestError;
    public static final j0h RateLimitError;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [i0h, java.lang.Object] */
    static {
        j0h j0hVar = new j0h("ApiConnectionError", 0, "api_connection_error");
        ApiConnectionError = j0hVar;
        j0h j0hVar2 = new j0h("ApiError", 1, "api_error");
        ApiError = j0hVar2;
        j0h j0hVar3 = new j0h("AuthenticationError", 2, "authentication_error");
        AuthenticationError = j0hVar3;
        j0h j0hVar4 = new j0h("CardError", 3, "card_error");
        CardError = j0hVar4;
        j0h j0hVar5 = new j0h("IdempotencyError", 4, "idempotency_error");
        IdempotencyError = j0hVar5;
        j0h j0hVar6 = new j0h("InvalidRequestError", 5, "invalid_request_error");
        InvalidRequestError = j0hVar6;
        j0h j0hVar7 = new j0h("RateLimitError", 6, "rate_limit_error");
        RateLimitError = j0hVar7;
        j0h[] j0hVarArr = {j0hVar, j0hVar2, j0hVar3, j0hVar4, j0hVar5, j0hVar6, j0hVar7};
        $VALUES = j0hVarArr;
        $ENTRIES = new wg7(j0hVarArr);
        Companion = new Object();
    }

    public j0h(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static j0h valueOf(String str) {
        return (j0h) Enum.valueOf(j0h.class, str);
    }

    public static j0h[] values() {
        return (j0h[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
