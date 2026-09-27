package io.sentry;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v6 {
    public static final Pattern d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    public final io.sentry.protocol.w a;
    public final e7 b;
    public final Boolean c;

    public v6(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            this.a = new io.sentry.protocol.w(matcher.group(1));
            this.b = new e7(matcher.group(2));
            String group = matcher.group(3);
            this.c = group != null ? Boolean.valueOf(ModuleRequestExtKt.CAPTURE_DELTA.equals(group.substring(1))) : null;
            return;
        }
        throw new Exception("sentry-trace header does not conform to expected format: ".concat(str), null);
    }

    public final String a() {
        String str;
        e7 e7Var = this.b;
        Boolean bool = this.c;
        io.sentry.protocol.w wVar = this.a;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = ModuleRequestExtKt.CAPTURE_DELTA;
            } else {
                str = "0";
            }
            return wVar + "-" + e7Var + "-" + str;
        }
        return wVar + "-" + e7Var;
    }

    public v6(io.sentry.protocol.w wVar, e7 e7Var, Boolean bool) {
        this.a = wVar;
        this.b = e7Var;
        this.c = bool;
    }
}
