package io.getstream.chat.android.network.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.dp8;
import defpackage.wga;
import defpackage.wwj;
import defpackage.x3j;
import defpackage.xwj;
import defpackage.ywj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"io/getstream/chat/android/network/models/UpdatePollRequest$VotingVisibility$VotingVisibilityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lywj;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lywj;", "Lwga;", "writer", "value", "", "toJson", "(Lwga;Lywj;)V", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdatePollRequest$VotingVisibility$VotingVisibilityAdapter extends JsonAdapter<ywj> {
    @Override // com.squareup.moshi.JsonAdapter
    @dp8
    public ywj fromJson(JsonReader reader) {
        reader.getClass();
        String nextString = reader.nextString();
        if (nextString == null) {
            return null;
        }
        if (Intrinsics.areEqual(nextString, "anonymous")) {
            return wwj.b;
        }
        if (Intrinsics.areEqual(nextString, "public")) {
            return wwj.c;
        }
        return new xwj(nextString);
    }

    @x3j
    public void toJson(wga writer, ywj value) {
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
        toJson(wgaVar, (ywj) obj);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
        return fromJson(jsonReader);
    }
}
