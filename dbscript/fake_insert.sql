insert into member 
values(1, '전성훤', 'donkihotex', '1234', 0, null, null, null, null,
null, 'm', null, sysdate, sysdate, '낭만이', 35, null, 'n', 'n', 5000, null, null);

insert into photo
values(1, null, null, null, null, null);

insert into party 
values(1, 1, sysdate, 27000, 12000, 5000, '모임', '닭갈비 먹으러 가실 분!', 
'제가 12000원 걸고 15000원만 셋이서 n빵하면 될것 같아요. 장소는 동작구 성대시장 앞에 닭갈비 집이에요~',
sysdate, null, null, 'y', 0, 0, 0, 'n', '서울시 동작구 상도로', 3, 'm', 1);
commit;
