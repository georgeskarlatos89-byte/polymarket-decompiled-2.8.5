package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zkc extends JsonAdapter {
    public final Type h;
    public final String i;
    public final Object j;
    public JsonAdapter k;

    public zkc(Type type, String str, Object obj) {
        this.h = type;
        this.i = str;
        this.j = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        JsonAdapter jsonAdapter = this.k;
        if (jsonAdapter != null) {
            return jsonAdapter.fromJson(jsonReader);
        }
        dmk.n("JsonAdapter isn't ready");
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(wga wgaVar, Object obj) {
        JsonAdapter jsonAdapter = this.k;
        if (jsonAdapter != null) {
            jsonAdapter.toJson(wgaVar, obj);
        } else {
            dmk.n("JsonAdapter isn't ready");
        }
    }

    public final String toString() {
        JsonAdapter jsonAdapter = this.k;
        if (jsonAdapter != null) {
            return jsonAdapter.toString();
        }
        return super.toString();
    }
}
