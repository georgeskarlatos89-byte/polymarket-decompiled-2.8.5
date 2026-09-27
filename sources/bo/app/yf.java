package bo.app;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.b69;
import defpackage.cb4;
import defpackage.pm1;
import defpackage.qga;
import defpackage.v1l;
import defpackage.yj9;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class yf implements yj9 {
    public final ag a;
    public final double b;
    public Double c;
    public boolean d;

    public yf(JSONObject jSONObject) {
        Double d;
        String string = jSONObject.getString(Keys.KEY_SESSION_ID);
        string.getClass();
        UUID fromString = UUID.fromString(string);
        fromString.getClass();
        this.a = new ag(fromString);
        this.b = jSONObject.getDouble("start_time");
        this.d = jSONObject.getBoolean("is_sealed");
        String str = qga.a;
        if (jSONObject.has("end_time") && !jSONObject.isNull("end_time")) {
            d = Double.valueOf(jSONObject.optDouble("end_time"));
        } else {
            d = null;
        }
        this.c = d;
    }

    public static final String a(double d, yf yfVar) {
        return "End time '" + d + "' for session is less than the start time '" + yfVar.b + "' for this session.";
    }

    public static final String b() {
        return "Caught exception creating Session Json.";
    }

    public final long c() {
        Double d = d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            long j = (long) (doubleValue - this.b);
            if (j < 0) {
                b69.h(this, pm1.W, null, false, new cb4(doubleValue, this), 6);
            }
            return j;
        }
        return -1L;
    }

    public Double d() {
        return this.c;
    }

    @Override // defpackage.yj9
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Keys.KEY_SESSION_ID, this.a);
            jSONObject.put("start_time", this.b);
            jSONObject.put("is_sealed", this.d);
            if (d() != null) {
                jSONObject.put("end_time", d());
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e) {
            b69.h(this, pm1.E, e, false, new v1l(15), 4);
            return jSONObject;
        }
    }

    public String toString() {
        return "\nSession(sessionId=" + this.a + ", startTime=" + this.b + ", endTime=" + d() + ", isSealed=" + this.d + ", duration=" + c() + ')';
    }

    @Override // defpackage.yj9
    public final /* bridge */ /* synthetic */ Object forJsonPut() {
        return forJsonPut();
    }

    public yf(ag agVar, double d, Double d2, boolean z) {
        agVar.getClass();
        this.a = agVar;
        this.b = d;
        ((wb) this).c = d2;
        this.d = z;
    }
}
