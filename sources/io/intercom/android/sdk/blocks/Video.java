package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import defpackage.k84;
import defpackage.sv6;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class Video implements VideoBlock {
    private final Api api;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: io.intercom.android.sdk.blocks.Video$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass2 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public AnonymousClass2(VideoPreviewView videoPreviewView, ImageView imageView, String str) {
            this.val$previewView = videoPreviewView;
            this.val$videoImageView = imageView;
            this.val$id = str;
        }

        public static /* synthetic */ void a(AnonymousClass2 anonymousClass2, VideoPreviewView videoPreviewView, String str, String str2) {
            anonymousClass2.lambda$onResponse$0(videoPreviewView, str, str2);
        }

        private /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, k84.g("https://player.vimeo.com/video/", str), str2);
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            AnonymousClass2 anonymousClass2;
            if (response.getIsSuccessful() && response.body() != null) {
                try {
                    try {
                        try {
                            anonymousClass2 = this;
                        } catch (IOException e) {
                            e = e;
                            anonymousClass2 = this;
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        response.body().close();
                    }
                    try {
                        this.val$videoImageView.post(new a(anonymousClass2, this.val$previewView, this.val$id, new JSONArray(response.body().string()).getJSONObject(0).getString("thumbnail_large"), 0));
                        response.body().close();
                    } catch (IOException e3) {
                        e = e3;
                        IOException iOException = e;
                        Video.access$100(Video.this).internal("ErrorObject", "Couldn't read response body: " + iOException.getMessage());
                        response.body().close();
                    }
                } catch (Throwable th) {
                    response.body().close();
                    throw th;
                }
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: io.intercom.android.sdk.blocks.Video$3, reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass3 implements Callback {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public AnonymousClass3(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        public static /* synthetic */ void a(AnonymousClass3 anonymousClass3, VideoPreviewView videoPreviewView, String str, String str2) {
            anonymousClass3.lambda$onResponse$0(videoPreviewView, str, str2);
        }

        private /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, str, str2);
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response.getIsSuccessful()) {
                this.val$videoImageView.post(new a(this, this.val$previewView, "https://www.useloom.com/embed/" + this.val$id, Video.access$000(Video.this, response), 1));
                return;
            }
            this.val$previewView.showFailedImage();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: io.intercom.android.sdk.blocks.Video$5, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = iArr;
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.VIMEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Video(StyleType styleType, Api api) {
        this.style = styleType;
        this.api = api;
    }

    public static /* synthetic */ String access$000(Video video, Response response) {
        return video.getThumbnailUrlFromOembedResponse(response);
    }

    public static /* synthetic */ Twig access$100(Video video) {
        return video.twig;
    }

    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Video.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    IntentUtils.safelyOpenIntent(imageView.getContext(), intent);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getThumbnailUrlFromOembedResponse(Response response) {
        int indexOf;
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                JSONObject jSONObject2 = new JSONObject(response.body().string());
                response.body().close();
                jSONObject = jSONObject2;
            } catch (IOException e) {
                this.twig.internal("ErrorObject", "Couldn't read response body: " + e.getMessage());
                String optString = jSONObject.optString("thumbnail_url");
                indexOf = optString.indexOf("?image_crop_resized");
                if (indexOf > 0) {
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                String optString2 = jSONObject.optString("thumbnail_url");
                indexOf = optString2.indexOf("?image_crop_resized");
                if (indexOf > 0) {
                }
            }
            String optString22 = jSONObject.optString("thumbnail_url");
            indexOf = optString22.indexOf("?image_crop_resized");
            if (indexOf > 0) {
                return optString22.substring(0, indexOf);
            }
            return optString22;
        } finally {
            response.body().close();
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        WebView webView = new WebView(context);
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        String embedUrl = VideoUrlUtilKt.getEmbedUrl(videoProvider, str2);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "https://" + context.getPackageName());
        webView.loadUrl(embedUrl, hashMap);
        return webView;
    }

    public void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    public void fetchThumbnail(VideoProvider videoProvider, final String str, final VideoPreviewView videoPreviewView) {
        final ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i = AnonymousClass5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.api.getVideo(k84.g("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/", str), new AnonymousClass3(videoPreviewView, str, thumbnailImageView));
                    return;
                }
                this.api.getVideo(sv6.n("https://vimeo.com/api/v2/video/", str, ".json"), new AnonymousClass2(videoPreviewView, thumbnailImageView, str));
                return;
            }
            createThumbnail(videoPreviewView, k84.g("https://www.youtube.com/watch?v=", str), sv6.n("https://img.youtube.com/vi/", str, "/default.jpg"));
            return;
        }
        this.api.getVideo(k84.g("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/", str), new Callback() { // from class: io.intercom.android.sdk.blocks.Video.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                videoPreviewView.showFailedImage();
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (response.getIsSuccessful()) {
                    final String str2 = "https://fast.wistia.net/embed/iframe/" + str;
                    final String access$000 = Video.access$000(Video.this, response);
                    thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Video.this.createThumbnail(videoPreviewView, str2, access$000);
                        }
                    });
                    return;
                }
                videoPreviewView.showFailedImage();
            }
        });
    }
}
