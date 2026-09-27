package defpackage;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dfa extends wfa {
    @Override // defpackage.m1g
    public z4g parseNetworkResponse(k3d k3dVar) {
        try {
            return new z4g(new JSONObject(new String(k3dVar.b, c1m.c(k3dVar.c))), c1m.b(k3dVar));
        } catch (UnsupportedEncodingException e) {
            return new z4g(new cdk(e));
        } catch (JSONException e2) {
            return new z4g(new cdk(e2));
        }
    }
}
