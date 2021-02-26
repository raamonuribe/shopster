import { Fragment } from 'react';
import { Col, Row } from 'react-bootstrap';
import products from '../products';
import Product from '../components/Product';
const HomeScreen = () => {
   const renderedProducts = products.map((product) => {
      return (
         <Col key={product._id} sm={12} md={6} lg={4} xl={3}>
            <Product product={product} />
         </Col>
      );
   });

   return (
      <Fragment>
         <h1>Latest Products</h1>
         <Row>{renderedProducts}</Row>
      </Fragment>
   );
};

export default HomeScreen;
