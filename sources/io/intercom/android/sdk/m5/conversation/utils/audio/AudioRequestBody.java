package io.intercom.android.sdk.m5.conversation.utils.audio;

import defpackage.jq1;
import java.io.File;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRequestBody;", "Lokhttp3/RequestBody;", "Ljava/io/File;", "audioFile", "<init>", "(Ljava/io/File;)V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljq1;", "sink", "", "writeTo", "(Ljq1;)V", "Ljava/io/File;", "fileRequestBody", "Lokhttp3/RequestBody;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioRequestBody extends RequestBody {
    public static final int $stable = 8;
    private final File audioFile;
    private final RequestBody fileRequestBody;

    public AudioRequestBody(File file) {
        file.getClass();
        this.audioFile = file;
        this.fileRequestBody = RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(AudioConstants.AUDIO_MEDIA_TYPE));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.fileRequestBody.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return this.fileRequestBody.get$contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(jq1 sink) {
        sink.getClass();
        this.fileRequestBody.writeTo(sink);
    }
}
