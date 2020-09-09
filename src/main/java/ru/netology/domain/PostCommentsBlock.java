package ru.netology.domain;

public class PostCommentsBlock {
    private boolean buttonComment;
    private String buttonCommentImageUrl;
    private String countComment;
    private boolean buttonSendComment;
    private String imageButtonSendCommentUrl;
    private String textComment;
    private String numberOfViews;

    //    Лайки к комментариям
    private boolean likeComment;
    private String likeImageUrl;
    private String countLike;
    private String textLikes;
    private boolean buttonShareComment;
    private String buttonShareCommentImageUrl;
    private String authorLikeId;
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
    private String id;
    private String ownerId;
    private String createdBy;
    private String date;
    private String replyPostId;
    private String friendsOnly;
    private String copyright;
    private String userLikes;
    private String canLike;
    private String geoType;
    private String coordinates;
    private String place;
    private String signerId;
    private String isPinned;
    private String markedAsAds;

}
