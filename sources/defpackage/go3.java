package defpackage;

import java.util.Set;
import kotlin.collections.ArraysKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class go3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ go3[] $VALUES;
    public static final go3 API_KEY_NOT_FOUND;
    public static final go3 AUTHENTICATION_ERROR;
    public static final go3 CANT_PARSE_CONNECTION_EVENT;
    public static final go3 CANT_PARSE_EVENT;
    public static final fo3 Companion;
    public static final go3 DUPLICATE_USERNAME_ERROR;
    public static final go3 INVALID_TOKEN;
    public static final go3 NETWORK_FAILED;
    public static final go3 NO_ERROR_BODY;
    public static final go3 PARSER_ERROR;
    public static final go3 SOCKET_CLOSED;
    public static final go3 SOCKET_FAILURE;
    public static final go3 TOKEN_DATE_INCORRECT;
    public static final go3 TOKEN_EXPIRED;
    public static final go3 TOKEN_NOT_VALID;
    public static final go3 TOKEN_SIGNATURE_INCORRECT;
    public static final go3 UNABLE_TO_PARSE_SOCKET_EVENT;
    public static final go3 UNDEFINED_TOKEN;
    public static final go3 VALIDATION_ERROR;
    private static final Set<Integer> authenticationErrors;
    private final int code;
    private final String description;

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, fo3] */
    static {
        go3 go3Var = new go3(0, 1000, "NETWORK_FAILED", "Response is failed. See cause");
        NETWORK_FAILED = go3Var;
        go3 go3Var2 = new go3(1, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, "PARSER_ERROR", "Unable to parse error");
        PARSER_ERROR = go3Var2;
        go3 go3Var3 = new go3(2, 1002, "SOCKET_CLOSED", "Server closed connection");
        SOCKET_CLOSED = go3Var3;
        go3 go3Var4 = new go3(3, 1003, "SOCKET_FAILURE", "See stack trace in logs. Intercept error in error handler of setUser");
        SOCKET_FAILURE = go3Var4;
        go3 go3Var5 = new go3(4, 1004, "CANT_PARSE_CONNECTION_EVENT", "Unable to parse connection event");
        CANT_PARSE_CONNECTION_EVENT = go3Var5;
        go3 go3Var6 = new go3(5, WebSocketProtocol.CLOSE_NO_STATUS_CODE, "CANT_PARSE_EVENT", "Unable to parse event");
        CANT_PARSE_EVENT = go3Var6;
        go3 go3Var7 = new go3(6, 1006, "INVALID_TOKEN", "Invalid token");
        INVALID_TOKEN = go3Var7;
        go3 go3Var8 = new go3(7, 1007, "UNDEFINED_TOKEN", "No defined token. Check if client.setUser was called and finished");
        UNDEFINED_TOKEN = go3Var8;
        go3 go3Var9 = new go3(8, 1008, "UNABLE_TO_PARSE_SOCKET_EVENT", "Socket event payload either invalid or null");
        UNABLE_TO_PARSE_SOCKET_EVENT = go3Var9;
        go3 go3Var10 = new go3(9, 1009, "NO_ERROR_BODY", "No error body. See http status code");
        NO_ERROR_BODY = go3Var10;
        go3 go3Var11 = new go3(10, 4, "VALIDATION_ERROR", "Validation error, check your credentials");
        VALIDATION_ERROR = go3Var11;
        go3 go3Var12 = new go3(11, 5, "AUTHENTICATION_ERROR", "Unauthenticated, problem with authentication");
        AUTHENTICATION_ERROR = go3Var12;
        go3 go3Var13 = new go3(12, 6, "DUPLICATE_USERNAME_ERROR", "Username(s) already exists.");
        DUPLICATE_USERNAME_ERROR = go3Var13;
        go3 go3Var14 = new go3(13, 40, "TOKEN_EXPIRED", "Token expired, new one must be requested.");
        TOKEN_EXPIRED = go3Var14;
        go3 go3Var15 = new go3(14, 41, "TOKEN_NOT_VALID", "Unauthenticated, token not valid yet");
        TOKEN_NOT_VALID = go3Var15;
        go3 go3Var16 = new go3(15, 42, "TOKEN_DATE_INCORRECT", "Unauthenticated, token date incorrect");
        TOKEN_DATE_INCORRECT = go3Var16;
        go3 go3Var17 = new go3(16, 43, "TOKEN_SIGNATURE_INCORRECT", "Unauthenticated, token signature invalid");
        TOKEN_SIGNATURE_INCORRECT = go3Var17;
        go3 go3Var18 = new go3(17, 2, "API_KEY_NOT_FOUND", "Api key is not found, verify it if it's correct or was created.");
        API_KEY_NOT_FOUND = go3Var18;
        go3[] go3VarArr = {go3Var, go3Var2, go3Var3, go3Var4, go3Var5, go3Var6, go3Var7, go3Var8, go3Var9, go3Var10, go3Var11, go3Var12, go3Var13, go3Var14, go3Var15, go3Var16, go3Var17, go3Var18};
        $VALUES = go3VarArr;
        $ENTRIES = new wg7(go3VarArr);
        Companion = new Object();
        authenticationErrors = ArraysKt.l0(new Integer[]{5, 40, 41, 42, 43});
    }

    public go3(int i, int i2, String str, String str2) {
        this.code = i2;
        this.description = str2;
    }

    public static final /* synthetic */ Set a() {
        return authenticationErrors;
    }

    public static go3 valueOf(String str) {
        return (go3) Enum.valueOf(go3.class, str);
    }

    public static go3[] values() {
        return (go3[]) $VALUES.clone();
    }

    public final int b() {
        return this.code;
    }

    public final String c() {
        return this.description;
    }
}
