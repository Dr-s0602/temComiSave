insert into member 
values(seq_me_num.nextval, '전성훤', 'donkihotex', '1234', 0, null, null, 
'donki@naver.com', '01082789999', null, 'M', '83/05/09', sysdate, '낭만이', 
41, null, 'N', 'N', 7000, null, 1);

insert into member 
values(seq_me_num.nextval, '전지훤', 'junjeejj', '1234', 0, null, null, 
'donki@naver.com', '01077779999', null, 'M', '84/11/11', sysdate, '지휑이', 
40, null, 'N', 'N', 9000, null, 1);

insert into member 
values(seq_me_num.nextval, '간석규', 'hsg', '1234', 0, null, null, 
'donki@naver.com', '01022223333', null, 'M', '89/03/19', sysdate, '피구왕통키', 
35, null, 'N', 'N', 3000, null, 1);

insert into member 
values(seq_me_num.nextval, '노인성', 'jis', '1234', 0, null, null, 
'jis@naver.com', '01011119999', null, 'M', '91/06/09', sysdate, '조인성', 
33, null, 'N', 'N', 0, null, 1);

insert into member 
values(seq_me_num.nextval, '김태히', 'taehi', '1234', 0, null, null, 
'taehi@naver.com', '01045452323', null, 'F', '99/12/23', sysdate, '태희', 
25, null, 'N', 'N', 10000, null, 1);

insert into main_category 
values(SEQ_cat_NUM.nextval, null, null);

insert into photo
values(SEQ_PH_NUM.nextval, null, null, null, null, null);

insert into photo
values(SEQ_PH_NUM.nextval, null, null, null, null, null);

insert into party 
values(SEQ_PA_NUM.nextval, 1, sysdate, 27000, 12000, 5000, '닭갈비 먹으러 가실 분!', 
'제가 12000원 걸고 15000원만 셋이서 n빵하면 될것 같아요. 장소는 동작구 성대시장 앞에 닭갈비 집이에요~',
sysdate, null, null, 'Y', 0, 0, 0, 'N', '서울시 동작구 상도로 15길 성대시장 칼도', 3, 'A', 1, 1);

insert into party 
values(SEQ_PA_NUM.nextval, 2, '23/07/05', 32000, 12000, 10000, '삼겹살 먹으러 가실 분!', 
'즐거운 모임을 가져보아요~ 장소는 강남역 삼겹살 집이에요~',
sysdate, null, null, 'Y', 0, 0, 0, 'N', '서울시 서초구 서초대로 123-3', 2, 'A', 1, 1);

insert into party 
values(SEQ_PA_NUM.nextval, 3, sysdate, 32000, 12000, 10000, '3삼겹살 먹으러 가실 분!', 
'3즐거운 모임을 가져보아요~ 장소는 강남역 삼겹살 집이에요~',
sysdate, null, null, 'Y', 0, 0, 0, 'N', '서울시 서초구 서초대로 123-3', 2, 'M', 1, 1);

insert into party 
values(SEQ_PA_NUM.nextval, 1, sysdate, 32000, 12000, 10000, '4삼겹살 먹으러 가실 분!', 
'4즐거운 모임을 가져보아요~ 장소는 강남역 삼겹살 집이에요~',
sysdate, null, null, 'Y', 0, 0, 0, 'N', '서울시 서초구 서초대로 123-3', 2, 'F', 1, 1);

insert into party 
values(SEQ_PA_NUM.nextval, 1, sysdate, 32000, 12000, 10000, '5삼겹살 먹으러 가실 분!', 
'5즐거운 모임을 가져보아요~ 장소는 강남역 삼겹살 집이에요~',
sysdate, null, null, 'N', 0, 0, 0, 'N', '서울시 서초구 서초대로 123-3', 3, 'F', 1, 1);

insert into party 
values(SEQ_PA_NUM.nextval, 1, sysdate, 32000, 12000, 10000, '6삼겹살 먹으러 가실 분!', 
'6즐거운 모임을 가져보아요~ 장소는 강남역 삼겹살 집이에요~',
sysdate, null, null, 'N', 0, 0, 0, 'N', '서울시 서초구 서초대로 123-3', 3, 'F', 1, 1);



insert into comphoto
values(SEQ_COM_PH_NUM.nextval, null, null, null, null, null);

insert into comments 
values(SEQ_COM_NUM.nextval, 1, 1, 1, '정말 맛있었어요!', 3, 0, 
sysdate, null, null, 1);


insert into comphoto
values(SEQ_COM_PH_NUM.nextval, null, null, null, null, null);

insert into comments 
values(SEQ_COM_NUM.nextval, 1, 1, 2, '2정말 맛있었어요!', 3, 0, 
sysdate, null, null, 2);

insert into comphoto
values(SEQ_COM_PH_NUM.nextval, null, null, null, null, null);

insert into comments 
values(SEQ_COM_NUM.nextval, 1, 1, 3, '3정말 맛있었어요!', 3, 0, 
sysdate, null, null, 3);

commit;
