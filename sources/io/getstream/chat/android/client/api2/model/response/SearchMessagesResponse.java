package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.SearchWarningDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/SearchMessagesResponse;", "", "results", "", "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;", "next", "", "previous", "resultsWarning", "Lio/getstream/chat/android/client/api2/model/dto/SearchWarningDto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/SearchWarningDto;)V", "getResults", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "getPrevious", "getResultsWarning", "()Lio/getstream/chat/android/client/api2/model/dto/SearchWarningDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class SearchMessagesResponse {
    private final String next;
    private final String previous;
    private final List<MessageResponse> results;
    private final SearchWarningDto resultsWarning;

    public SearchMessagesResponse(List<MessageResponse> list, String str, String str2, SearchWarningDto searchWarningDto) {
        list.getClass();
        this.results = list;
        this.next = str;
        this.previous = str2;
        this.resultsWarning = searchWarningDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMessagesResponse copy$default(SearchMessagesResponse searchMessagesResponse, List list, String str, String str2, SearchWarningDto searchWarningDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchMessagesResponse.results;
        }
        if ((i & 2) != 0) {
            str = searchMessagesResponse.next;
        }
        if ((i & 4) != 0) {
            str2 = searchMessagesResponse.previous;
        }
        if ((i & 8) != 0) {
            searchWarningDto = searchMessagesResponse.resultsWarning;
        }
        return searchMessagesResponse.copy(list, str, str2, searchWarningDto);
    }

    public final List<MessageResponse> component1() {
        return this.results;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrevious() {
        return this.previous;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchWarningDto getResultsWarning() {
        return this.resultsWarning;
    }

    public final SearchMessagesResponse copy(List<MessageResponse> results, String next, String previous, SearchWarningDto resultsWarning) {
        results.getClass();
        return new SearchMessagesResponse(results, next, previous, resultsWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMessagesResponse)) {
            return false;
        }
        SearchMessagesResponse searchMessagesResponse = (SearchMessagesResponse) other;
        if (Intrinsics.areEqual(this.results, searchMessagesResponse.results) && Intrinsics.areEqual(this.next, searchMessagesResponse.next) && Intrinsics.areEqual(this.previous, searchMessagesResponse.previous) && Intrinsics.areEqual(this.resultsWarning, searchMessagesResponse.resultsWarning)) {
            return true;
        }
        return false;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final List<MessageResponse> getResults() {
        return this.results;
    }

    public final SearchWarningDto getResultsWarning() {
        return this.resultsWarning;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.results.hashCode() * 31;
        String str = this.next;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.previous;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        SearchWarningDto searchWarningDto = this.resultsWarning;
        if (searchWarningDto != null) {
            i = searchWarningDto.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "SearchMessagesResponse(results=" + this.results + ", next=" + this.next + ", previous=" + this.previous + ", resultsWarning=" + this.resultsWarning + ")";
    }
}
