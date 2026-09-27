package io.getstream.chat.android.network.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.dp8;
import defpackage.ub5;
import defpackage.vb5;
import defpackage.wb5;
import defpackage.wga;
import defpackage.x3j;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"io/getstream/chat/android/network/models/CreateDeviceRequest$PushProvider$PushProviderAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lwb5;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lwb5;", "Lwga;", "writer", "value", "", "toJson", "(Lwga;Lwb5;)V", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateDeviceRequest$PushProvider$PushProviderAdapter extends JsonAdapter<wb5> {
    @Override // com.squareup.moshi.JsonAdapter
    @dp8
    public wb5 fromJson(JsonReader reader) {
        reader.getClass();
        String nextString = reader.nextString();
        if (nextString == null) {
            return null;
        }
        switch (nextString.hashCode()) {
            case -1206476313:
                if (nextString.equals("huawei")) {
                    return ub5.d;
                }
                break;
            case -759499589:
                if (nextString.equals("xiaomi")) {
                    return ub5.e;
                }
                break;
            case -563351033:
                if (nextString.equals("firebase")) {
                    return ub5.c;
                }
                break;
            case 96799:
                if (nextString.equals("apn")) {
                    return ub5.b;
                }
                break;
        }
        return new vb5(nextString);
    }

    @x3j
    public void toJson(wga writer, wb5 value) {
        String str;
        writer.getClass();
        if (value != null) {
            str = value.a;
        } else {
            str = null;
        }
        writer.a0(str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(wga wgaVar, Object obj) {
        toJson(wgaVar, (wb5) obj);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
        return fromJson(jsonReader);
    }
}
