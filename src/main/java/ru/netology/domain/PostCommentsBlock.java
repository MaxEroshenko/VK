package ru.netology.domain;

public class PostCommentsBlock {
    private boolean buttonComment;
    private String buttonCommentImageUrl;
    private int countComment;
    private boolean buttonSendComment;
    private String imageButtonSendCommentUrl;
    private String textComment;
    private String numberOfViews;

    //    Лайки к комментариям
    private boolean likeComment;
    private String likeImageUrl;
    private int countLike;
    private String textLikes;
    private boolean buttonShareComment;
    private String buttonShareCommentImageUrl;
    private int authorLikeId;
    private String authorLikeUrl;
    private String authorLikeImageUrl;

    //    Кнопка пожаловаться в комментариях
    private boolean complain;
    private String complainImageUrl;

    //    Автор комментария
    private boolean authorId;
    private String authorUrl;
    private String authorImageUrl;

    //    + get/set на все поля

    // Блок "Запись на стене"
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private boolean friendsOnly;
    private String copyright;
    private int countReposts;
    private boolean userReposted;
    private int countViews;
    private String countViewsImageUrl;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private String postponedId;

}
