package io.intercom.android.sdk.models;

import io.intercom.android.sdk.utilities.NullSafety;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class Upload {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String acl;
        String aws_access_key;
        String content_type;
        long id;
        String key;
        UploadMetadata metadata;
        String policy;
        String public_url;
        String signature;
        String success_action_status;
        String upload_destination;

        private UploadMetadata defaultMetadataBuilder() {
            UploadMetadata uploadMetadata = this.metadata;
            if (uploadMetadata != null) {
                return uploadMetadata;
            }
            return new UploadMetadata("");
        }

        public Upload build() {
            return new AutoValue_Upload(this.id, NullSafety.valueOrEmpty(this.acl), NullSafety.valueOrEmpty(this.aws_access_key), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.key), NullSafety.valueOrEmpty(this.policy), NullSafety.valueOrEmpty(this.public_url), NullSafety.valueOrEmpty(this.signature), NullSafety.valueOrEmpty(this.success_action_status), NullSafety.valueOrEmpty(this.upload_destination), defaultMetadataBuilder());
        }
    }

    public abstract String getAcl();

    public abstract String getAwsAccessKey();

    public abstract String getContentType();

    public abstract long getId();

    public abstract String getKey();

    public abstract UploadMetadata getMetadata();

    public abstract String getPolicy();

    public abstract String getPublicUrl();

    public abstract String getSignature();

    public abstract String getSuccessActionStatus();

    public abstract String getUploadDestination();
}
