package io.intercom.android.sdk.survey.ui.models;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.adh;
import defpackage.b0;
import defpackage.dmk;
import defpackage.eb4;
import defpackage.ikl;
import defpackage.ix2;
import defpackage.ke;
import defpackage.m51;
import defpackage.nwh;
import defpackage.qqc;
import defpackage.rib;
import defpackage.sv6;
import defpackage.woa;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.radar.sdk.RadarTrackingOptions;
import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer;", "", "<init>", "()V", "getLength", "", "DateTimeAnswer", "SingleAnswer", "MultipleAnswer", "NoAnswer", "MediaAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Answer {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", AttributeType.DATE, "", "hours", "", "minutes", "<init>", "(JII)V", "getDate", "()J", "getHours", "()I", "getMinutes", "getLength", "getLocalTime", "", "getDateAsString", "getAnswer", "formatTime", "time", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public DateTimeAnswer(long j, int i, int i2) {
            super(null);
            this.date = j;
            this.hours = i;
            this.minutes = i2;
        }

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = dateTimeAnswer.date;
            }
            if ((i3 & 2) != 0) {
                i = dateTimeAnswer.hours;
            }
            if ((i3 & 4) != 0) {
                i2 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j, i, i2);
        }

        private final String formatTime(int time) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            if (time < 0) {
                time = 0;
            }
            String format = decimalFormat.format(Integer.valueOf(time));
            format.getClass();
            return format;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHours() {
            return this.hours;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        public final DateTimeAnswer copy(long date, int hours, int minutes) {
            return new DateTimeAnswer(date, hours, minutes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) other;
            if (this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes) {
                return true;
            }
            return false;
        }

        public final String getAnswer() {
            StringBuilder sb = new StringBuilder();
            sb.append(getDateAsString());
            sb.append('T');
            sb.append(formatTime(this.hours));
            sb.append(':');
            return woa.r(sb, formatTime(this.minutes), ":00Z");
        }

        public final long getDate() {
            return this.date;
        }

        public final String getDateAsString() {
            long j = this.date;
            if (j != -1) {
                String formatTimeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j, "YYYY-MM-dd");
                formatTimeInMillisAsDate.getClass();
                return formatTimeInMillisAsDate;
            }
            return "";
        }

        public final int getHours() {
            return this.hours;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.date);
            sb.append(this.hours);
            sb.append(this.minutes);
            return sb.toString().length();
        }

        public final String getLocalTime() {
            int i;
            int i2 = this.hours;
            if (i2 != -1 && (i = this.minutes) != -1) {
                String formatFromUtcTime = TimeFormatter.formatFromUtcTime(i2, i);
                formatFromUtcTime.getClass();
                return formatFromUtcTime;
            }
            return "";
        }

        public final int getMinutes() {
            return this.minutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutes) + woa.b(this.hours, Long.hashCode(this.date) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DateTimeAnswer(date=");
            sb.append(this.date);
            sb.append(", hours=");
            sb.append(this.hours);
            sb.append(", minutes=");
            return sv6.o(sb, this.minutes, ')');
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\tH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "", "<init>", "(Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class SingleAnswer extends Answer {
        public static final int $stable = 0;
        private final String answer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAnswer(String str) {
            super(null);
            str.getClass();
            this.answer = str;
        }

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        public final SingleAnswer copy(String answer) {
            answer.getClass();
            return new SingleAnswer(answer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof SingleAnswer) && Intrinsics.areEqual(this.answer, ((SingleAnswer) other).answer)) {
                return true;
            }
            return false;
        }

        public final String getAnswer() {
            return this.answer;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.answer.length();
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        public String toString() {
            return m51.m(new StringBuilder("SingleAnswer(answer="), this.answer, ')');
        }
    }

    public /* synthetic */ Answer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getLength();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\nH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "mediaItems", "", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "<init>", "(Ljava/util/List;)V", "getMediaItems", "()Ljava/util/List;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "MediaItem", "FileUploadStatus", "FileUploadError", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class MediaAnswer extends Answer {
        public static final int $stable = 8;
        private final List<MediaItem> mediaItems;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR+\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\nR\u001b\u0010\u0007\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", ApiConstant.KEY_DATA, "<init>", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "uploadStatus", "", "setUploadStatus", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;)V", "component1", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "copy", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "getData", "<set-?>", "_uploadStatus$delegate", "Lqqc;", "get_uploadStatus", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "set_uploadStatus", "_uploadStatus", "uploadStatus$delegate", "Lnwh;", "getUploadStatus", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final /* data */ class MediaItem {
            public static final int $stable = 8;

            /* renamed from: _uploadStatus$delegate, reason: from kotlin metadata */
            private final qqc _uploadStatus;
            private final MediaData.Media data;

            /* renamed from: uploadStatus$delegate, reason: from kotlin metadata */
            private final nwh uploadStatus;

            public MediaItem(MediaData.Media media) {
                media.getClass();
                this.data = media;
                this._uploadStatus = ikl.c(FileUploadStatus.None.INSTANCE);
                this.uploadStatus = adh.b(new ke(this, 11));
            }

            public static /* synthetic */ FileUploadStatus a(MediaItem mediaItem) {
                return uploadStatus_delegate$lambda$0(mediaItem);
            }

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i, Object obj) {
                if ((i & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            private final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus.getValue();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus.setValue(fileUploadStatus);
            }

            private static final FileUploadStatus uploadStatus_delegate$lambda$0(MediaItem mediaItem) {
                return mediaItem.get_uploadStatus();
            }

            /* renamed from: component1, reason: from getter */
            public final MediaData.Media getData() {
                return this.data;
            }

            public final MediaItem copy(MediaData.Media data) {
                data.getClass();
                return new MediaItem(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof MediaItem) && Intrinsics.areEqual(this.data, ((MediaItem) other).data)) {
                    return true;
                }
                return false;
            }

            public final MediaData.Media getData() {
                return this.data;
            }

            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus.getValue();
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public final void setUploadStatus(FileUploadStatus uploadStatus) {
                uploadStatus.getClass();
                set_uploadStatus(uploadStatus);
            }

            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAnswer(List<MediaItem> list) {
            super(null);
            list.getClass();
            this.mediaItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        public final MediaAnswer copy(List<MediaItem> mediaItems) {
            mediaItems.getClass();
            return new MediaAnswer(mediaItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof MediaAnswer) && Intrinsics.areEqual(this.mediaItems, ((MediaAnswer) other).mediaItems)) {
                return true;
            }
            return false;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.mediaItems.size();
        }

        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        public String toString() {
            return sv6.r(new StringBuilder("MediaAnswer(mediaItems="), this.mediaItems, ')');
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "", "<init>", "()V", "None", "Queued", "Uploading", "Success", "Error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "<init>", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;)V", "getError", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* data */ class Error extends FileUploadStatus {
                public static final int $stable = 8;
                private final FileUploadError error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(FileUploadError fileUploadError) {
                    super(null);
                    fileUploadError.getClass();
                    this.error = fileUploadError;
                }

                public static /* synthetic */ Error copy$default(Error error, FileUploadError fileUploadError, int i, Object obj) {
                    if ((i & 1) != 0) {
                        fileUploadError = error.error;
                    }
                    return error.copy(fileUploadError);
                }

                /* renamed from: component1, reason: from getter */
                public final FileUploadError getError() {
                    return this.error;
                }

                public final Error copy(FileUploadError error) {
                    error.getClass();
                    return new Error(error);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if ((other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error)) {
                        return true;
                    }
                    return false;
                }

                public final FileUploadError getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Error(error=" + this.error + ')';
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;
                public static final None INSTANCE = new None();

                private None() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "<init>", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* data */ class Success extends FileUploadStatus {
                public static final int $stable = 0;
                private final long id;

                public Success(long j) {
                    super(null);
                    this.id = j;
                }

                public static /* synthetic */ Success copy$default(Success success, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = success.id;
                    }
                    return success.copy(j);
                }

                /* renamed from: component1, reason: from getter */
                public final long getId() {
                    return this.id;
                }

                public final Success copy(long id) {
                    return new Success(id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if ((other instanceof Success) && this.id == ((Success) other).id) {
                        return true;
                    }
                    return false;
                }

                public final long getId() {
                    return this.id;
                }

                public int hashCode() {
                    return Long.hashCode(this.id);
                }

                public String toString() {
                    return ix2.n(new StringBuilder("Success(id="), this.id, ')');
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super(null);
                }
            }

            public /* synthetic */ FileUploadStatus(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private FileUploadStatus() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0017\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "", "errorMessages", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "getErrorMessages", "()Ljava/util/List;", "UploadFailed", "FileLimitExceeded", "UnsupportedFileType", "FileTooLarge", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static abstract class FileUploadError {
            public static final int $stable = 8;
            private final List<StringProvider.StringRes> errorMessages;

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileTooLarge(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFailed(List<StringProvider.StringRes> list) {
                    super(list, null);
                    list.getClass();
                }
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }

            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            public /* synthetic */ FileUploadError(List list, DefaultConstructorMarker defaultConstructorMarker) {
                this(list);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0012H×\u0001J\t\u0010\u001b\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answers", "", "", "otherAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "(Ljava/util/Set;Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;)V", "getAnswers", "()Ljava/util/Set;", "getOtherAnswer", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "copyWithAnswerToggled", "answer", "copyWithOther", "", "getLength", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "OtherAnswer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class MultipleAnswer extends Answer {
        public static final int $stable = 8;
        private final Set<String> answers;
        private final OtherAnswer otherAnswer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(Set<String> set, OtherAnswer otherAnswer) {
            super(null);
            set.getClass();
            otherAnswer.getClass();
            this.answers = set;
            this.otherAnswer = otherAnswer;
        }

        public static /* synthetic */ CharSequence a(String str) {
            return getLength$lambda$1(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set set, OtherAnswer otherAnswer, int i, Object obj) {
            if ((i & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i & 2) != 0) {
                otherAnswer = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer);
        }

        private static final CharSequence getLength$lambda$1(String str) {
            str.getClass();
            return str;
        }

        public final Set<String> component1() {
            return this.answers;
        }

        /* renamed from: component2, reason: from getter */
        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public final MultipleAnswer copy(Set<String> answers, OtherAnswer otherAnswer) {
            answers.getClass();
            otherAnswer.getClass();
            return new MultipleAnswer(answers, otherAnswer);
        }

        public final Answer copyWithAnswerToggled(String answer) {
            answer.getClass();
            LinkedHashSet P0 = CollectionsKt.P0(this.answers);
            if (this.answers.contains(answer)) {
                P0.remove(answer);
            } else {
                P0.add(answer);
            }
            if (P0.isEmpty() && (this.otherAnswer instanceof OtherAnswer.NotSelected)) {
                return NoAnswer.ResetNoAnswer.INSTANCE;
            }
            return copy$default(this, P0, null, 2, null);
        }

        public final Answer copyWithOther(OtherAnswer otherAnswer) {
            otherAnswer.getClass();
            if (this.answers.isEmpty() && (otherAnswer instanceof OtherAnswer.NotSelected)) {
                return NoAnswer.ResetNoAnswer.INSTANCE;
            }
            return copy$default(this, null, otherAnswer, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) other;
            if (Intrinsics.areEqual(this.answers, multipleAnswer.answers) && Intrinsics.areEqual(this.otherAnswer, multipleAnswer.otherAnswer)) {
                return true;
            }
            return false;
        }

        public final List<String> getAnswers() {
            rib b = eb4.b();
            b.addAll(CollectionsKt.M0(this.answers));
            OtherAnswer otherAnswer = this.otherAnswer;
            if (!Intrinsics.areEqual(otherAnswer, OtherAnswer.NotSelected.INSTANCE)) {
                if (Intrinsics.areEqual(otherAnswer, OtherAnswer.SelectedNoText.INSTANCE)) {
                    b.add("Other");
                } else if (otherAnswer instanceof OtherAnswer.SelectedWithText) {
                    b.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                } else {
                    dmk.a();
                    return null;
                }
            }
            return eb4.a(b);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return CollectionsKt.N(this.answers, null, null, null, new b0(25), 31).length();
        }

        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public int hashCode() {
            return this.otherAnswer.hashCode() + (this.answers.hashCode() * 31);
        }

        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "", "<init>", "()V", "toString", "", "NotSelected", "SelectedNoText", "SelectedWithText", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", "other", "", "hashCode", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final /* data */ class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedWithText(String str) {
                    super(null);
                    str.getClass();
                    this.text = str;
                }

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                public final SelectedWithText copy(String text) {
                    text.getClass();
                    return new SelectedWithText(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if ((other instanceof SelectedWithText) && Intrinsics.areEqual(this.text, ((SelectedWithText) other).text)) {
                        return true;
                    }
                    return false;
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @Override // io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer
                public String toString() {
                    return this.text;
                }
            }

            public /* synthetic */ OtherAnswer(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public String toString() {
                return "";
            }

            private OtherAnswer() {
            }
        }

        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer otherAnswer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : otherAnswer);
        }

        /* renamed from: getAnswers, reason: collision with other method in class */
        public final Set<String> m435getAnswers() {
            return this.answers;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "<init>", "()V", "getLength", "", "InitialNoAnswer", "ResetNoAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super(null);
            }
        }

        private NoAnswer() {
            super(null);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return 0;
        }

        public /* synthetic */ NoAnswer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Answer() {
    }
}
